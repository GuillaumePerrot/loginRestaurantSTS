package com.login.connexion.controller;

import java.util.List;

import org.hibernate.HibernateException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.login.connexion.models.Reservation;
import com.login.connexion.service.IReservationService;

@RestController
@RequestMapping("reservation")
@CrossOrigin("http://localhost:4200")
public class ReservationController {

	@Autowired
	IReservationService reservationService;
	
	@GetMapping("/all")
	public List<Reservation> getAll() {
		return reservationService.getAllReservation();
	}
	
	@GetMapping("/{idReservation}")
	public Reservation getByReservation(@PathVariable long idReservation) {
		return reservationService.findById(idReservation);
	}
	
	
	@DeleteMapping("/delete/{idReservation}")
	public Boolean deleteByReservation(@PathVariable long idReservation) {
		try {
			reservationService.deleteReservation(idReservation);
			return true;
		} catch(HibernateException e){
			e.printStackTrace();
			return false;
		}
	}
	
	@PostMapping
	public Reservation createReservation(@RequestBody Reservation reservation) {
		 return reservationService.createReservation(reservation);
	}
	
}
