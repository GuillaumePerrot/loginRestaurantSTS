package com.login.connexion.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.login.connexion.models.Role;

public interface IRoleRepository extends JpaRepository<Role, Long>{
	
}
