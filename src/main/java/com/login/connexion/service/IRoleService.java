package com.login.connexion.service;

import java.util.List;

import com.login.connexion.models.Role;

public interface IRoleService {

	public List<Role> getAllRole();
	public Boolean deleteRole(long idRole);
	public Role findById (long idRole);
	public Role createRole (Role createRole);
	
}
