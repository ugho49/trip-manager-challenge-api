package fr.ustephan.tripmanager.presentation.form;

import fr.ustephan.tripmanager.infrastructure.model.PlaceModel;

import javax.validation.constraints.NotNull;

/**
 * @author ugho_stephan.
 */
public class PlaceForm {

    @NotNull
    private String name;
    private Double latitude;
    private Double longitude;

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(final Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(final Double longitude) {
        this.longitude = longitude;
    }

    PlaceModel toModel() {
        return new PlaceModel(name, latitude, longitude);
    }
}
