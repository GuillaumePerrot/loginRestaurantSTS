package com.login.connexion.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.login.connexion.models.Reservation;
import com.login.connexion.repository.IReservationRepository;

@Service
public class ReservationService implements IReservationService{

	@Autowired
	IReservationRepository reservationRepository;
	
	@Override
	public List<Reservation> getAllReservation() { 
		return this.reservationRepository.findAll();
	}

	@Override
	public Boolean deleteReservation(long idReservation) {
		try {
		   reservationRepository.deleteById(idReservation);
		   return true;
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}

	@Override
	public Reservation createReservation(Reservation createReservation) {
		return reservationRepository.save(createReservation);
	}

	@Override
	public Reservation findById(long idReservation) {
		Optional<Reservation> reservationOptional = reservationRepository.findById(idReservation);
		Reservation reservation = new Reservation();
		if(reservationOptional.isPresent()) {
			reservation = reservationOptional.get();
		}
		return reservation;
	}

	
	
}
