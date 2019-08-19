package fr.ustephan.tripmanager.domain;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

/**
 * @author ugho_stephan.
 */
public class Step {

    private final LocalDate start;
    private final LocalDate end;
    private final Place stayingAt;
    private final List<Place> placesToVisit;

    public Step(final LocalDate start, final LocalDate end, final Place stayingAt, final List<Place> placesToVisit) {
        this.start = start;
        this.end = end;
        this.stayingAt = stayingAt;
        this.placesToVisit = Collections.unmodifiableList(placesToVisit);
    }

    public LocalDate getStart() {
        return start;
    }

    public LocalDate getEnd() {
        return end;
    }

    public Place getStayingAt() {
        return stayingAt;
    }

    public List<Place> getPlacesToVisit() {
        return placesToVisit;
    }
}
