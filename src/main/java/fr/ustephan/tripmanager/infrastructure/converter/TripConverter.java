package fr.ustephan.tripmanager.infrastructure.converter;

import fr.ustephan.tripmanager.domain.Trip;
import fr.ustephan.tripmanager.infrastructure.model.TripModel;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

/**
 * @author ugho_stephan.
 */
@Component
public class TripConverter implements BaseConverter<Trip, TripModel> {

    private final StepConverter stepConverter;

    public TripConverter(final StepConverter stepConverter) {
        this.stepConverter = stepConverter;
    }

    @Override
    public Trip toDomain(final TripModel tripModel) {
        final var steps = tripModel.getSteps()
                .stream()
                .map(stepConverter::toDomain)
                .collect(Collectors.toList());
        return new Trip(tripModel.getId(), tripModel.getName(), steps);
    }

    @Override
    public TripModel toModel(final Trip trip) {
        final var steps = trip.getSteps()
                .stream()
                .map(stepConverter::toModel)
                .collect(Collectors.toList());
        return new TripModel(trip.getId(), trip.getName(), steps);
    }
}
