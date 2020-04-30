package com.login.connexion.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="tb_user")
public class User {

	@Id
	@GeneratedValue
	private long idUser;
	
	private String nomUser;
	private String prenomUser;
	
	private String adresseMail;
	private String password;
	
	@ManyToOne
	private Role role;

	public User(long idUser, String nomUser, String prenomUser, String adresseMail, String password, Role role) {
		super();
		this.idUser = idUser;
		this.nomUser = nomUser;
		this.prenomUser = prenomUser;
		this.adresseMail = adresseMail;
		this.password = password;
		this.role = role;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getIdUser() {
		return idUser;
	}

	public void setIdUser(long idUser) {
		this.idUser = idUser;
	}

	public String getNomUser() {
		return nomUser;
	}

	public void setNomUser(String nomUser) {
		this.nomUser = nomUser;
	}

	public String getPrenomUser() {
		return prenomUser;
	}

	public void setPrenomUser(String prenomUser) {
		this.prenomUser = prenomUser;
	}

	public String getAdresseMail() {
		return adresseMail;
	}

	public void setAdresseMail(String adresseMail) {
		this.adresseMail = adresseMail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	
	
}
