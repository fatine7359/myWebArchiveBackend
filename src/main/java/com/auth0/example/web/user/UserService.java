package com.auth0.example.web.user;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.auth0.example.model.Users.User;

import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

@Service
public class UserService {
	
	private final RestTemplate restTemplate = new RestTemplate();
	
	public List<User> getAllUsers() {
		String url="http://localhost:3000/api/users";
		ResponseEntity<User[]> response = restTemplate.getForEntity(url, User[].class);
		
		User[] user = response.getBody();
		
		return Arrays.asList(user);
	}
	
	public User[] getUserById(String uid) {
		String url="http://localhost:3000/api/users/getuser/{uid}";
		ResponseEntity<User[]> response = restTemplate.getForEntity(url, User[].class, uid);
		
		User[] user = response.getBody();
		
		return user;
	}
	
	public void addUser(User user) {
		restTemplate.postForObject("http://localhost:3000/api/users", user, ResponseEntity.class);
	}
	
	
	public void updateUserEmail(@RequestBody User user) {
		String url = "http://localhost:3000/api/users";
//		User updatedUser = new User(user.getUid(), user.getDisplayName(), user.setEmail(email), user.getImageUrl());
//		User user = restTemplate.put(URI_USERS_ID, updatedUser, User.class);
		HttpEntity<User> entity = new HttpEntity<>(user);
		this.restTemplate.put(url, entity);
	}
	
	public void updateUserImage(@RequestBody User user, @RequestParam String imageUrl ) {
		String url = "http://localhost:3000/api/users/updateuser/{imageUrl}";
		HttpEntity<User> entity = new HttpEntity<>(user);
		this.restTemplate.put(url, entity, imageUrl);
	}
	
	public void deleteUser(String uid) {
		String url = "http://localhost:3000/api/users";
		
		this.restTemplate.delete(url,uid);
	}
	
	
	
	
}
