package fr.ustephan.tripmanager.infrastructure.converter;

import fr.ustephan.tripmanager.domain.Step;
import fr.ustephan.tripmanager.infrastructure.model.StepModel;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

/**
 * @author ugho_stephan.
 */
@Component
public class StepConverter implements BaseConverter<Step, StepModel> {

    private final PlaceConverter placeConverter;

    public StepConverter(final PlaceConverter placeConverter) {
        this.placeConverter = placeConverter;
    }

    @Override
    public Step toDomain(final StepModel stepModel) {
        final var placesToVisit = stepModel.getPlacesToVisit()
                .stream()
                .map(placeConverter::toDomain)
                .collect(Collectors.toList());
        return new Step(stepModel.getStart(), stepModel.getEnd(), placeConverter.toDomain(stepModel.getStayingAt()), placesToVisit);
    }

    @Override
    public StepModel toModel(final Step step) {
        final var placesToVisit = step.getPlacesToVisit()
                .stream()
                .map(placeConverter::toModel)
                .collect(Collectors.toList());
        return new StepModel(step.getStart(), step.getEnd(), placeConverter.toModel(step.getStayingAt()), placesToVisit);
    }

}
