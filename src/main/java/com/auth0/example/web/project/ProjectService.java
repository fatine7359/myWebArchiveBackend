//package com.auth0.example.web.project;
//
//import com.auth0.example.model.Enums.StatusProjet;
//import com.auth0.example.model.Projects.Project;
//
//import org.springframework.http.HttpEntity;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Service;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.client.RestTemplate;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//@Service
//public class ProjectService {
//
////	private final RestTemplate restTemplate = new RestTemplate();
////
////    public List<Project> getAllProjects(){
////    	String url="http://localhost:3000/api/projects/getAll";
////		ResponseEntity<Project[]> response = restTemplate.getForEntity(url, Project[].class);
////		
////		Project[] project = response.getBody();
////		
////		return Arrays.asList(project);
////    }
////
////    //get one keyword at a time?
////    public Project[] getProjectByKeyWords( List<String> keyWords){
////    	String url="http://localhost:3000/api/projects/getuser/{keyWords}";
////		ResponseEntity<Project[]> response = restTemplate.getForEntity(url, Project[].class, keyWords);
////		
////		Project[] project = response.getBody();
////		
////		return project;
////    }
////
////    public Project[] getProjectByProjectType(@RequestParam("type") String type){
////    	String url="http://localhost:3000/api/projects/getuser/{type}";
////		ResponseEntity<Project[]> response = restTemplate.getForEntity(url, Project[].class, type);
////		
////		Project[] project = response.getBody();
////		
////		return project;
////    }
////
////    public Project[] getProjectByStudent(@RequestParam("name") String name, @RequestParam("level") String level){
////    	String url="http://localhost:3000/api/projects/getuser/{name}&{level}";
////		ResponseEntity<Project[]> response = restTemplate.getForEntity(url, Project[].class, name, level);
////		
////		Project[] project = response.getBody();
////		
////		return project;
////    }
////
////    //i can change the requestbody to requestparams and work on creating a new user
////    public void addProject(@RequestBody Project project){
////    	List<Project> newProjects = new ArrayList<>();
////		newProjects.add(project);
////		
////		restTemplate.postForObject("http://localhost:3000/api/projects/addproject", newProjects, ResponseEntity.class);
////
////    }
////    
//////    public void assignProfessor(@RequestBody Prof supervisor){
//////    	
//////    }
////
////    //its a put method
////    public void changeStatus(@RequestParam("status") StatusProjet status, @RequestBody Project project){
////    	String url = "http://localhost:3000/api/projects/changestatus/{status}&{project}";
////    	HttpEntity<Project> entity = new HttpEntity<>(project);
////		this.restTemplate.put(url, entity, status); //is it correct?
////    }
////
////    //it's a put method
////    //is it correct 
////    public void updateVersion(@RequestParam("title") String title, @RequestBody Project project){
////    	String url = "http://localhost:3000/api/projects/updateversion/{title}";
////    	HttpEntity<Project> entity = new HttpEntity<>(project);
////		this.restTemplate.put(url, entity, title); //is it correct?
////
////    }
////    
////    //its a put method
////    public void rateProject(int note, @RequestBody Project project){
////    	String url = "http://localhost:3000/api/projects/rateproject/{note}";
////    	HttpEntity<Project> entity = new HttpEntity<>(project);
////		this.restTemplate.put(url, entity, note); //is it correct?
////    }
//}
