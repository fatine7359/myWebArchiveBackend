package com.auth0.example.web.project;



import com.auth0.example.model.Enums.StatusProjet;
import com.auth0.example.model.Enums.TypeProjet;
import com.auth0.example.model.Projects.Project;
import com.auth0.example.model.Users.Prof;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Service
public class ProjectService {

    private final RestTemplate restTemplate;

    public ProjectService(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }


    public List<Project> getAllProjects(){

        String url = "http://localhost:3000/api/projects/";



        ResponseEntity<Project[]> response =
                restTemplate.getForEntity(
                        url,
                        Project[].class);
        Project[] projects = response.getBody();
        return Arrays.asList(projects);
    }

    public Project getProjectbyId(String projectId) {
        String url = "http://localhost:3000/nodeServer/projects/{projectId}";
        ResponseEntity<Project> response = restTemplate.getForEntity(url,Project.class, projectId);
        Project project = response.getBody();
        return project;
    }

    public List<Project> getAllProjectsTeacher(String teacherId){

        //On peut utiliser cette ligne
        //String url = "http://localhost:8080/nodeServer/teachers/" + "{" + teacherId + "}/projects";

        //Ou
        String url = "http://localhost:3000/nodeServer/teachers/{teacherId}/projects";

        ResponseEntity<Project[]> response =
                restTemplate.getForEntity(
                        url,
                        Project[].class,
                        teacherId);

        Project[] projects = response.getBody();
        return Arrays.asList(projects);
    }


    //how to get one keyword at a time
    public List<Project> getProjectByKeyWords( String keyWords){
        String url="http://localhost:3000/api/projects/{keyWords}";
        ResponseEntity<Project[]> response = restTemplate.getForEntity(url, Project[].class, keyWords);

        Project[] project = response.getBody();

        return Arrays.asList(project);
    }

    public List<Project> getProjectByProjectType( TypeProjet type){
        String url="http://localhost:3000/api/projects/{type}";
        ResponseEntity<Project[]> response = restTemplate.getForEntity(url, Project[].class,type);

        Project[] project = response.getBody();

        return Arrays.asList(project);
    }

    public List<Project> getProjectByStudent(@RequestParam("id") String id ){
        String url="http://localhost:3000/api/projects/getuser/{id}";
        ResponseEntity<Project[]> response = restTemplate.getForEntity(url, Project[].class,id);

        Project[] project = response.getBody();

        return Arrays.asList(project);
    }

    //i can change the requestbody to requestparams and work on creating a new user
    public void addProject(@RequestBody Project project){
        List<Project> newProjects = new ArrayList<>();
        newProjects.add(project);

        restTemplate.postForObject("http://localhost:3000/projects/addproject", newProjects, ResponseEntity.class);

    }

//    public void assignProfessor(@RequestBody Prof supervisor){
//
//    }

    //its a put method
    //  public void changeStatus(@RequestParam("status") StatusProjet status, @RequestParam Long projectid){
    //    String url = "http://localhost:3000/projects/changestatus/{status}&{project}";
    //  Project p = this.getProjectbyId(projectid);
    // HttpEntity<Project> entity = new HttpEntity<>(p);
    //this.restTemplate.put(url, entity, status); //is it correct?
    //}



    //public void rateProject(int note, @RequestParam Long projectid){
    //  String url ="http://localhost:3000/projects/rateProject/{projectid}/{note}";
    //Project p = this.getProjectbyId(projectid);
    //HttpEntity<Project> entity =new HttpEntity<>(p);
    //this.restTemplate.put(url,entity, note);
    //}

    // public void addKeywordtoProject(List<String> keywords, @RequestParam Long projectid){
    //   String url="http://localhost:3000/projects/{projectid}/addKeyword/{keywords}";
    // Project p = this.getProjectbyId(projectid);
    //HttpEntity<Project> entity = new HttpEntity<>(p);
    //this.restTemplate.put(url,entity,keywords);
    // }

}