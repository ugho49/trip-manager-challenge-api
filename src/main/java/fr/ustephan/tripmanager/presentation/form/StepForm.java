package fr.ustephan.tripmanager.presentation.form;

import fr.ustephan.tripmanager.infrastructure.model.PlaceModel;
import fr.ustephan.tripmanager.infrastructure.model.StepModel;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @author ugho_stephan.
 */
public class StepForm {

    private static final String DATE_PATERN = "yyyy-MM-dd";

    @NotNull(message = "Le champs start est requis")
    @DateTimeFormat(pattern = DATE_PATERN)
    private LocalDate start;
    @NotNull
    @DateTimeFormat(pattern = DATE_PATERN)
    private LocalDate end;
    @Valid
    @NotNull
    private PlaceForm stayingAt;
    @Valid
    private List<PlaceForm> placesToVisit;

    public LocalDate getStart() {
        return start;
    }

    public void setStart(final LocalDate start) {
        this.start = start;
    }

    public LocalDate getEnd() {
        return end;
    }

    public void setEnd(final LocalDate end) {
        this.end = end;
    }

    public PlaceForm getStayingAt() {
        return stayingAt;
    }

    public void setStayingAt(final PlaceForm stayingAt) {
        this.stayingAt = stayingAt;
    }

    public List<PlaceForm> getPlacesToVisit() {
        return placesToVisit;
    }

    public void setPlacesToVisit(final List<PlaceForm> placesToVisit) {
        this.placesToVisit = placesToVisit;
    }

    StepModel toModel() {
        final List<PlaceModel> places = Optional.ofNullable(placesToVisit)
                .orElse(Collections.emptyList())
                .stream()
                .map(PlaceForm::toModel)
                .collect(Collectors.toList());
        return new StepModel(start, end, stayingAt.toModel(), places);
    }
}
