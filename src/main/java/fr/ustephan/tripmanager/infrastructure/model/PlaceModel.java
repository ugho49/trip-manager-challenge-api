package fr.ustephan.tripmanager.infrastructure.model;

/**
 * @author ugho_stephan.
 */
public class PlaceModel {

    private String name;
    private Double latitude;
    private Double longitude;

    public PlaceModel() {
    }

    public PlaceModel(final String name, final Double latitude, final Double longitude) {
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getName() {
        return name;
    }

    public Double getLatitude() {
        return latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public void setLatitude(final Double latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(final Double longitude) {
        this.longitude = longitude;
    }
}
