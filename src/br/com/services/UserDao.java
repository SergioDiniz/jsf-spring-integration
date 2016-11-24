package br.com.services;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import br.com.beans.User;

public class UserDao implements UserDIT {

	private Session session;
	
	public UserDao() {
		session = new Configuration().configure().buildSessionFactory().openSession();
	}
	
	@Override
	public void addUser(User user) {		
		try {
			session.beginTransaction();
			session.save(user);
			session.getTransaction().commit();
		} finally {
			session.close();
		}
	}

	@Override
	public User findUser(int id) {
		try {
			User user;
			session.beginTransaction();
			user = session.find(User.class, id);
			session.getTransaction().commit();
			return user;
		} finally {
			session.close();
		}
	}

	@Override
	public List<User> listUsers() {
		
		List<User> users= new ArrayList<>();
		
		Query query = session.createQuery("from User");
		users = query.getResultList();
		
		return users;
	}

}
