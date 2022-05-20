package com.auth0.example.web.user;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.auth0.example.model.Users.User;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.multipart.MultipartFile;

@Service
public class UserService{
	
	private final RestTemplate restTemplate;
	private final Path root = Paths.get("uploads");


	public UserService(RestTemplateBuilder restTemplateBuilder) {
		this.restTemplate = restTemplateBuilder.build();
	}


	public List<User> getAllUsers() {
		String url="http://localhost:3000/api/users/getAll";
		ResponseEntity<User[]> response = restTemplate.getForEntity(url, User[].class);
		
		User[] user = response.getBody();
		
		return Arrays.asList(user);
	}
	
	public User[] getUserById(String authHeader, String uid) {
		String url="http://localhost:3000/api/users/getuser/{uid}";
		ResponseEntity<User[]> response = restTemplate.getForEntity(url, User[].class, uid);
		
		User[] user = response.getBody();
		
		return user;
	}
	
	public void addUser(User user) {

		// send POST request
		ResponseEntity<User> response = this.restTemplate.postForEntity("http://localhost:3000/api/users/adduser", user, User.class);

		//restTemplate.postForObject("http://localhost:3000/api/users/adduser", user, ResponseEntity.class);
	}
	
	public void deleteUser(String uid) {
		String url = "http://localhost:3000/api/users/deleteuser";
		this.restTemplate.delete(url,uid);
	}
	
	//delete and add
	public void updateUser(User user, String uid) {
		//String url = "http://localhost:3000/api/users/updateuser/{id}";
//		User updatedUser = new User(user.getUid(), user.getDisplayName(), user.setEmail(email), user.getImageUrl());
//		User user = restTemplate.put(URI_USERS_ID, updatedUser, User.class);
//		HttpEntity<User> entity = new HttpEntity<>(user);

		// create headers
		HttpHeaders headers = new HttpHeaders();
		// set `content-type` header
		headers.setContentType(MediaType.APPLICATION_JSON);
		// set `accept` header
		headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
		String url = "http://localhost:3000/api/users/updateuser";
		this.restTemplate.put(url, user, uid);
	}
	
	//import excel file and do postall
	public void uploadUser(MultipartFile file){
        try{
            Files.copy(file.getInputStream(), this.root.resolve(file.getOriginalFilename()));
        } catch(Exception e){
            throw new RuntimeException("Could not store the file. Error :" + e.getMessage());
        }
    }

	public void addMultipleUsers(List<User> users) {
		//String url = "http://localhost:3010/api/users/addMultipleUsers";
		for(int i=0; i<users.size();i++) {
			addUser(users.get(i));
		}
	}
}
