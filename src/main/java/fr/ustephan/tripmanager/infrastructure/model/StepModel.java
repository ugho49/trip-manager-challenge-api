package fr.ustephan.tripmanager.infrastructure.model;

import java.time.LocalDate;
import java.util.List;

/**
 * @author ugho_stephan.
 */
public class StepModel {

    private LocalDate start;
    private LocalDate end;
    private PlaceModel stayingAt;
    private List<PlaceModel> placesToVisit;

    public StepModel() {
    }

    public StepModel(final LocalDate start, final LocalDate end, final PlaceModel stayingAt, final List<PlaceModel> placesToVisit) {
        this.start = start;
        this.end = end;
        this.stayingAt = stayingAt;
        this.placesToVisit = placesToVisit;
    }

    public LocalDate getStart() {
        return start;
    }

    public LocalDate getEnd() {
        return end;
    }

    public PlaceModel getStayingAt() {
        return stayingAt;
    }

    public List<PlaceModel> getPlacesToVisit() {
        return placesToVisit;
    }

    public void setStart(final LocalDate start) {
        this.start = start;
    }

    public void setEnd(final LocalDate end) {
        this.end = end;
    }

    public void setStayingAt(final PlaceModel stayingAt) {
        this.stayingAt = stayingAt;
    }

    public void setPlacesToVisit(final List<PlaceModel> placesToVisit) {
        this.placesToVisit = placesToVisit;
    }
}
