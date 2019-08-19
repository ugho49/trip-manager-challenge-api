package fr.ustephan.tripmanager.domain;

import java.util.Collections;
import java.util.List;

/**
 * @author ugho_stephan.
 */
public class Trip {
    private final String id;
    private final String name;
    private final List<Step> steps;

    public Trip(final String name, final List<Step> steps) {
        this(null, name, steps);
    }

    public Trip(final String id, final String name, final List<Step> steps) {
        this.id = id;
        this.name = name;
        this.steps = Collections.unmodifiableList(steps);
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Step> getSteps() {
        return steps;
    }
}
