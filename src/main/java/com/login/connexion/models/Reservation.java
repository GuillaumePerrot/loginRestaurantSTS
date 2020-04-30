package com.login.connexion.models;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table(name="tb_reservation")
public class Reservation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idReservation;
	private long nbPersonnes;
	private String Service;
	private String nomReservation;
	
	@JoinColumn(name="id_user")
	@OneToOne
	private User user;
	
	private Date date;

	public Reservation(long idReservation, long nbPersonnes, String service, String nomReservation,
			com.login.connexion.models.User user, Date date) {
		super();
		this.idReservation = idReservation;
		this.nbPersonnes = nbPersonnes;
		Service = service;
		this.nomReservation = nomReservation;
		this.user = user;
		this.date = date;
	}

	public Reservation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getIdReservation() {
		return idReservation;
	}

	public void setIdReservation(long idReservation) {
		this.idReservation = idReservation;
	}

	public long getNbPersonnes() {
		return nbPersonnes;
	}

	public void setNbPersonnes(long nbPersonnes) {
		this.nbPersonnes = nbPersonnes;
	}

	public String getService() {
		return Service;
	}

	public void setService(String service) {
		Service = service;
	}

	public String getNomReservation() {
		return nomReservation;
	}

	public void setNomReservation(String nomReservation) {
		this.nomReservation = nomReservation;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	
}
