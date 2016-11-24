package br.com.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.beans.User;
import br.com.dao.UserDao;

@Service("userService")
public class UserServiceImp implements UserService {

	@Autowired
	private UserDao userDao;
	
	@Override
	public void addUser(User user) {
		userDao.addUser(user);
	}

	@Override
	public User findUser(int id) {
		return userDao.findUser(id);
	}

	@Override
	public List<User> listUsers() {
		return userDao.listUsers();
	}

}
