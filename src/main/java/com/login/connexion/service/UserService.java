package com.login.connexion.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.login.connexion.models.User;
import com.login.connexion.repository.IRoleRepository;
import com.login.connexion.repository.IUserRepository;


@Service
public class UserService implements IUserService{

	@Autowired
	IUserRepository userRepository;
	
	@Autowired
	IRoleRepository roleRepository;
	
	@Override
	public List<User> getAllUser() {
		return userRepository.findAll();
	}

	@Override
	public Boolean deleteUser(long idUser) {
       try {
    	  userRepository.deleteById(idUser);
    	  return true;
       } catch(Exception e) {
    	   e.printStackTrace();
    	   return false;
       }
	}

	@Override
	public User findById(long idUser) {
		Optional<User> userOptional = userRepository.findById(idUser);
		User user = new User();
		if (userOptional.isPresent()) {
			user = userOptional.get();
		}
		return user;
	}

	@Override
	public User createUser(User createUser) {
		System.err.println("L'élement a bien été ajouté !");
		return userRepository.save(createUser);
	}

	@Override
	public User updateUser(User updateUser) {
		return userRepository.save(updateUser);
	}

	@Override
	public User connexionUser(String adresseMail, String password) {
		User user = userRepository.findByAdresseMailAndPassword(adresseMail, password);
		if(user != null) {
			System.err.println("L'adresse e-mail" + adresseMail + "et le mot de passe " + password + "existent");
			return user;
		} else {
			System.err.println("Les identifiants n'éxistent pas");
			return null;
		}
		
	}

     

}
