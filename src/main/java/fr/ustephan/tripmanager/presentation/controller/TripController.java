package fr.ustephan.tripmanager.presentation.controller;

import fr.ustephan.tripmanager.domain.Trip;
import fr.ustephan.tripmanager.infrastructure.exception.RestResponseException;
import fr.ustephan.tripmanager.infrastructure.model.TripModel;
import fr.ustephan.tripmanager.infrastructure.service.TripService;
import fr.ustephan.tripmanager.presentation.form.TripForm;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpClientErrorException;

import javax.validation.Valid;
import java.util.List;

/**
 * @author ugho_stephan.
 */
@RestController
@RequestMapping("/api/trip")
public class TripController {

    private final TripService tripService;

    public TripController(final TripService tripService) {
        this.tripService = tripService;
    }

    @GetMapping
    public List<Trip> getTrips() {
        return tripService.findAll();
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public Trip createTrip(@Valid @RequestBody TripForm form, BindingResult result) throws RestResponseException {

        if (result.hasErrors()) {
            throw new RestResponseException(HttpStatus.BAD_REQUEST, "Erreur au niveau des champs");
        }

        return tripService.create(form.toModel());
    }

    @PutMapping("/{id}")
    public Trip createTrip(@PathVariable String id, @Valid @RequestBody TripForm form, BindingResult result) throws RestResponseException {

        if (!tripService.existsById(id)) {
            throw new RestResponseException(HttpStatus.NOT_FOUND, "Trip innexistant en base");
        }

        if (result.hasErrors()) {
            throw new RestResponseException(HttpStatus.BAD_REQUEST, "Erreur au niveau des champs");
        }

        final TripModel tripModel = form.toModel();
        tripModel.setId(id);

        return tripService.update(tripModel);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity createTrip(@PathVariable String id) throws RestResponseException {

        if (!tripService.existsById(id)) {
            throw new RestResponseException(HttpStatus.NOT_FOUND, "Trip innexistant en base");
        }

        tripService.delete(id);
        return ResponseEntity.ok("Trip supprimé avec succès");
    }
}
