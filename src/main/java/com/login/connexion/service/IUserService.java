package com.login.connexion.service;

import java.util.List;

import com.login.connexion.models.User;

public interface IUserService {

	public List<User> getAllUser();
	public Boolean deleteUser(long idUser);
	public User findById(long idUser);
	public User createUser(User createUser);
	public User updateUser(User updateUser);
	
	public User connexionUser(String adresseMail, String password);
	
}
