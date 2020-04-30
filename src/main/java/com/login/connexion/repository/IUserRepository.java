package com.login.connexion.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.login.connexion.models.User;

public interface IUserRepository extends JpaRepository<User, Long>{

	public User findByAdresseMailAndPassword(String adresseMail, String password);
	
}
