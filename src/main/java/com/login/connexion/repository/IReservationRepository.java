package com.login.connexion.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.login.connexion.models.Reservation;

public interface IReservationRepository extends JpaRepository<Reservation, Long>{

}
