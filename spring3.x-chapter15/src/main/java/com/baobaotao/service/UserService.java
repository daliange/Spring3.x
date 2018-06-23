package com.baobaotao.service;

import org.springframework.stereotype.Service;

import com.baobaotao.domain.User;

@Service("userService")
public class UserService {
   
	public void createUser(User user){
		System.out.println("save user.");
	}

	public User getUserById(String userId) {
		User user = new User();
		user.setUserId(userId);
		user.setUserName("test");
		return user;
	}
	
}
