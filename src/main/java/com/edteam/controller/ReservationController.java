package com.edteam.controller;

import com.edteam.dto.ReservationDTO;
import com.edteam.model.Reservation;
import com.edteam.repository.ReservationRepository;
import com.edteam.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/reservation")
public class ReservationController {

    private ReservationService service;

    @Autowired
    public ReservationController(ReservationService reservationService) {
        this.service = reservationService;
    }


    @GetMapping
    public ResponseEntity<List<ReservationDTO>> getReservations() {
        List<ReservationDTO> reservations = service.getReservations();
        return new ResponseEntity<>(reservations, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ReservationDTO> getReservationById(@PathVariable Long id) {
        ReservationDTO reservation = service.getReservationById(id);
        return new ResponseEntity<>(reservation, HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<ReservationDTO> saveReservation(@RequestBody ReservationDTO reservation) {
        ReservationDTO reservationn = service.save(reservation);
        return new ResponseEntity<>(reservationn, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ReservationDTO> updateReservation(@PathVariable Long id, @RequestBody ReservationDTO reservation) {
        ReservationDTO reservationn = service.update(id, reservation);
        return new ResponseEntity<>(reservationn, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ReservationDTO> deleteReservationById(@PathVariable Long id) {
        service.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
