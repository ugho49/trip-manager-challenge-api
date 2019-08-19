package fr.ustephan.tripmanager.domain;

import java.util.Optional;

import static java.util.Optional.ofNullable;

/**
 * @author ugho_stephan.
 */
public class Place {

    private final String name;
    private final Double latitude;
    private final Double longitude;

    public Place(final String name, final Double latitude, final Double longitude) {
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getName() {
        return name;
    }

    public Optional<Double> getLatitude() {
        return ofNullable(latitude);
    }

    public Optional<Double> getLongitude() {
        return ofNullable(longitude);
    }
}
