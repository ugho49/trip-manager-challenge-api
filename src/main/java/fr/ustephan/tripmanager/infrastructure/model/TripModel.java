package fr.ustephan.tripmanager.infrastructure.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

/**
 * @author ugho_stephan.
 */
@Document(collection = "trip")
public class TripModel {
    @Id
    private String id;
    private String name;
    private List<StepModel> steps;

    public TripModel() {
    }

    public TripModel(final String id, final String name, final List<StepModel> steps) {
        this.id = id;
        this.name = name;
        this.steps = steps;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<StepModel> getSteps() {
        return steps;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public void setSteps(final List<StepModel> steps) {
        this.steps = steps;
    }
}
