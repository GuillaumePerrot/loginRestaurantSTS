package com.login.connexion;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConnexionApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(ConnexionApplication.class, args);
		System.err.println("Initialisation réussie !");
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
