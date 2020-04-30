package com.login.connexion.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_role")
public class Role {

	@Id
	@GeneratedValue
	private long idRole;
	
	private String role;

	public Role( String role) {
		super();
		this.role = role;
	}

	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getIdRole() {
		return idRole;
	}

	public void setIdRole(long idRole) {
		this.idRole = idRole;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
	
	
}
