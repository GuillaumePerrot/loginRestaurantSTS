package com.login.connexion.service;

import java.util.List;

import com.login.connexion.models.Reservation;

public interface IReservationService {

	public List<Reservation> getAllReservation();
	public Boolean deleteReservation(long idReservation);
	public Reservation createReservation(Reservation createReservation);
	public Reservation findById(long idReservation);
	
}
