package fr.ustephan.tripmanager.infrastructure.service;

import fr.ustephan.tripmanager.domain.Trip;
import fr.ustephan.tripmanager.infrastructure.converter.TripConverter;
import fr.ustephan.tripmanager.infrastructure.model.TripModel;
import fr.ustephan.tripmanager.infrastructure.repository.TripRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @author ugho_stephan.
 */
@Service
public class TripService {

    private final TripRepository tripRepository;
    private final TripConverter tripConverter;

    public TripService(final TripRepository tripRepository, final TripConverter tripConverter) {
        this.tripRepository = tripRepository;
        this.tripConverter = tripConverter;
    }

    public List<Trip> findAll() {
        return tripRepository.findAll().stream().map(tripConverter::toDomain).collect(Collectors.toList());
    }

    public Optional<Trip> findById(final String id) {
        return tripRepository.findById(id).map(tripConverter::toDomain);
    }

    public boolean existsById(final String id) {
        return tripRepository.existsById(id);
    }

    public Trip create(final TripModel tripModel) {
        final TripModel createdModel = tripRepository.insert(tripModel);
        return tripConverter.toDomain(createdModel);
    }

    public Trip update(final TripModel tripModel) {
        final TripModel updatedModel = tripRepository.save(tripModel);
        return tripConverter.toDomain(updatedModel);
    }

    public void delete(final String id) {
        tripRepository.deleteById(id);
    }
}
