package com.login.connexion.models;

public class Login {

	private String adresseMailLogin;
	private String passwordLogin;
	
	public Login(String adresseMailLogin, String passwordLogin) {
		super();
		this.adresseMailLogin = adresseMailLogin;
		this.passwordLogin = passwordLogin;
	}

	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getAdresseMailLogin() {
		return adresseMailLogin;
	}

	public void setAdresseMailLogin(String adresseMailLogin) {
		this.adresseMailLogin = adresseMailLogin;
	}

	public String getPasswordLogin() {
		return passwordLogin;
	}

	public void setPasswordLogin(String passwordLogin) {
		this.passwordLogin = passwordLogin;
	}
	
	
	
}
