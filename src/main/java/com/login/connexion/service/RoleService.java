package com.login.connexion.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.login.connexion.models.Role;
import com.login.connexion.repository.IRoleRepository;

@Service
public class RoleService implements IRoleService{
	
	@Autowired
	IRoleRepository roleRepository;

	@Override
	public List<Role> getAllRole() {
		return roleRepository.findAll();
	}

	@Override
	public Boolean deleteRole(long idRole) {
		 try {
	    	  roleRepository.deleteById(idRole);
	    	  return true;
	       } catch(Exception e) {
	    	   e.printStackTrace();
	    	   return false;
	       }
	}

	@Override
	public Role findById(long idRole) {
		Optional<Role> roleOptional = roleRepository.findById(idRole);
		Role role = new Role();
		if (roleOptional.isPresent()) {
			role = roleOptional.get();
		}
		return role;
	}

	@Override
	public Role createRole(Role createRole) {
		return roleRepository.save(createRole);
	}

	
}
