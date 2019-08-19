package fr.ustephan.tripmanager.infrastructure.converter;

import fr.ustephan.tripmanager.domain.Place;
import fr.ustephan.tripmanager.infrastructure.model.PlaceModel;
import org.springframework.stereotype.Component;

/**
 * @author ugho_stephan.
 */
@Component
public class PlaceConverter implements BaseConverter<Place, PlaceModel> {

    @Override
    public Place toDomain(final PlaceModel placeModel) {
        return new Place(placeModel.getName(), placeModel.getLatitude(), placeModel.getLongitude());
    }

    @Override
    public PlaceModel toModel(final Place place) {
        return new PlaceModel(place.getName(), place.getLatitude().orElse(null), place.getLongitude().orElse(null));
    }

}
