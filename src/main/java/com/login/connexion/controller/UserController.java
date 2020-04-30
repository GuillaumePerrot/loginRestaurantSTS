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

import com.login.connexion.models.Login;
import com.login.connexion.models.User;
import com.login.connexion.service.IRoleService;
import com.login.connexion.service.IUserService;

@RestController
@RequestMapping("user")
@CrossOrigin("http://localhost:4200")
public class UserController {

	@Autowired
	IUserService userService;
	
	@Autowired
	IRoleService roleService;
	
	@GetMapping("/all")
	public List<User> getAll() {
		return userService.getAllUser();
	}
	
	@GetMapping("/{idUser}")
	public User getByUser(@PathVariable long idUser) {
		return userService.findById(idUser);
	}
	
	@PostMapping
	public User createUser(@RequestBody User user) {
		System.err.println("Création réussie !");
		return userService.createUser(user);
	}
	
	@DeleteMapping("/delete/{idUser}")
	public Boolean deleteByUser(@PathVariable long idUser) {
		try {
		userService.deleteUser(idUser);
	    return true;
		} catch(HibernateException e) {
		e.printStackTrace();
		return false;
		}
	}
	
	@PostMapping("/connexion/adresseMail/password")
	public User connexionUtilisateur (@RequestBody Login login) {
		return userService.connexionUser(login.getAdresseMailLogin(), login.getPasswordLogin());
		
	}
	
}
