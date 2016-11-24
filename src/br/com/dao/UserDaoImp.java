package br.com.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import br.com.beans.User;

@Repository("userDao")
public class UserDaoImp implements UserDao {

	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		System.out.println("add");
	}

	@Override
	public User findUser(int id) {
		System.out.println("find");
		return null;
	}

	@Override
	public List<User> listUsers() {
		System.out.println("List");
		return null;
	}

	

}
