package br.com.dao;

import java.util.List;

import br.com.beans.User;

public interface UserDao {

	void addUser(User user);
	
	User findUser(int id);
	
	List<User> listUsers();
	
}
