package br.com.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import br.com.beans.User;

@Repository("userDao")
public class UserDaoImp implements UserDao {

	
	private Session session;
//	private EntityManager em;
	
	public UserDaoImp() {
		// TODO Auto-generated constructor stub
		Configuration configuration = new Configuration();
		session = configuration.configure().buildSessionFactory().openSession();
//		em = new Persistence().createEntityManagerFactory("user-jsf").createEntityManager();
	}
	
	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		System.out.println("add");
//		em.getTransaction().begin();
//		em.persist(user);
//		em.getTransaction().commit();
		
		session.beginTransaction();
		session.persist(user);
		session.getTransaction().commit();
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
