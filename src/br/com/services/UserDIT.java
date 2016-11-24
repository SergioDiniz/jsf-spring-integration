package br.com.services;

import java.util.List;

import br.com.beans.User;

public interface UserDIT {

	void addUser(User user);
	
	User findUser(int id);
	
	List<User> listUsers();
	
}
