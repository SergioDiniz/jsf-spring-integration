package br.com.controllers;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.beans.User;
import br.com.services.UserService;

@Component
@ManagedBean(name="userController")
@RequestScoped
public class UserController {

	@Autowired
	private UserService userService;
	
	private User user;
	
	public UserController() {
		// TODO Auto-generated constructor stub
	}
	
	@PostConstruct
	private void init(){
		this.user = new User();
	}
	
	public void addUser(){
		userService.addUser(this.user);
		this.user = new User();
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
	
	
}
