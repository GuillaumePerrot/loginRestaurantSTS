package com.login.connexion.controller;

import java.util.List;

import org.hibernate.HibernateException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.login.connexion.models.Role;
import com.login.connexion.service.IRoleService;

@RestController
@RequestMapping("role")
@CrossOrigin("http://localhost:4200")
public class RoleController {

	@Autowired
	IRoleService roleService;
	
	@GetMapping("/all")
	// Equivalent du getpost dans les servlets
	public List<Role> getAll() {
		return roleService.getAllRole();
	}
	
	@GetMapping("/{idRole}")
	public Role getByRole(@PathVariable long idRole) {
		return roleService.findById(idRole);
	}
	
	@DeleteMapping("/delete/{idRole}")
	public Boolean deleteByRole(@PathVariable long idRole) {
		try {
		roleService.deleteRole(idRole);
	    return true;
		} catch(HibernateException e) {
		e.printStackTrace();
		return false;
		}
	}
	
	@PostMapping
	public Role createUser(@RequestBody Role role) {
		return roleService.createRole(role);
	}
	
}
