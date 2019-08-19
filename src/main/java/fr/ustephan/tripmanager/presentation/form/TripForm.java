package fr.ustephan.tripmanager.presentation.form;

import fr.ustephan.tripmanager.infrastructure.model.StepModel;
import fr.ustephan.tripmanager.infrastructure.model.TripModel;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author ugho_stephan.
 */
public class TripForm {

    @NotBlank
    private String name;
    @Valid
    @NotEmpty
    private List<StepForm> steps;

    public String getName() {
        return name;
    }

    public List<StepForm> getSteps() {
        return steps;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public void setSteps(final List<StepForm> steps) {
        this.steps = steps;
    }

    public TripModel toModel() {
        final List<StepModel> steps = this.steps.stream().map(StepForm::toModel).collect(Collectors.toList());
        return new TripModel(null, name, steps);
    }
}
