package fr.ustephan.tripmanager.infrastructure.repository;

import fr.ustephan.tripmanager.infrastructure.model.TripModel;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author ugho_stephan.
 */
public interface TripRepository extends MongoRepository<TripModel, String> {
}
