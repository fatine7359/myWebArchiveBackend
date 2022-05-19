package com.auth0.example.web.project;



import com.auth0.example.model.Enums.StatusProjet;
import com.auth0.example.model.Projects.Project;
import com.auth0.example.model.Users.Prof;
import org.springframework.boot.web.client.RestTemplateBuilder;

import org.springframework.http.HttpEntity;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;


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


    /*public List<Project> getAllProjects() {

        String url = "http://localhost:3000/projects";

        HttpHeaders headers = new HttpHeaders();

        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
    }


    /*public ProjectService(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }


    public List<Project> getAllProjects(){

        String url = "http://localhost:3000/projects";

        HttpHeaders headers = new HttpHeaders();

        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));

        ResponseEntity<Project[]> response =
                restTemplate.getForEntity(
                        url,
                        Project[].class);
        Project[] projects = response.getBody();
        return Arrays.asList(projects);
    }



    public List<Project> getAllProjectsTeacher(Long teacherId){

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
    public List<Project> getProjectByKeyWords( List<String> keyWords){
        String url="http://localhost:8000/api/projects/getuser/{keyWords}";
        ResponseEntity<Project[]> response = restTemplate.getForEntity(url, Project[].class);

        Project[] project = response.getBody();

        return Arrays.asList(project);
    }

    public List<Project> getProjectByProjectType(@RequestParam("type") String type){
        String url="http://localhost:8000/api/projects/getuser/{type}";
        ResponseEntity<Project[]> response = restTemplate.getForEntity(url, Project[].class);

        Project[] project = response.getBody();

        return Arrays.asList(project);
    }

    public List<Project> getProjectByStudent(@RequestParam("id") Long id ){
        String url="http://localhost:8000/api/projects/getuser/{id}";
        ResponseEntity<Project[]> response = restTemplate.getForEntity(url, Project[].class);

        Project[] project = response.getBody();

        return Arrays.asList(project);
    }

    //i can change the requestbody to requestparams and work on creating a new user
    public void addProject(@RequestBody Project project){
        List<Project> newProjects = new ArrayList<>();
        newProjects.add(project);

        restTemplate.postForObject("http://localhost:3000/projects/addproject", newProjects, ResponseEntity.class);

        ResponseEntity<Project[]> response =
                restTemplate.getForEntity(
                        url,
                        Project[].class);
        Project[] projects = response.getBody();
        return Arrays.asList(projects);
    }


    public List<Project> getAllProjectsTeacher(Long teacherId){

        //On peut utiliser cette ligne
        //String url = "http://localhost:8080/nodeServer/teachers/" + "{" + teacherId + "}/projects";

        //Ou
        String url = "http://localhost:8080/nodeServer/teachers/{teacherId}/projects";

        ResponseEntity<Project[]> response =
                restTemplate.getForEntity(
                        url,
                        Project[].class,
                        teacherId);



//    public void assignProfessor(@RequestBody Prof supervisor){
//
//    }

    //its a put method
    public void changeStatus(@RequestParam("status") StatusProjet status, @RequestBody Project project){*/
        /*String url = "http://localhost:3000/projects/changestatus/{status}&{project}";
        HttpEntity<Project> entity = new HttpEntity<>(project);
        this.restTemplate.put(url, entity, status); //is it correct?
    }

    //it's a put method
    //is it correct
    public void updateVersion(String title, @RequestBody Project project){
        String url = "http://localhost:8080/api/projects/updateversion/{title}";
        HttpEntity<Project> entity = new HttpEntity<>(project);
        this.restTemplate.put(url, entity, title); //is it correct?

        Project[] projects = response.getBody();
        return Arrays.asList(projects);
    }



    public void rateProject(int note, @RequestBody Project project){
        String url ="http://localhost:3000/projects/rateProject/{note}";
        HttpEntity<Project> entity =new HttpEntity<>(project);
        this.restTemplate.put(url,entity, note);

    public List<Project> getAllProjectsStudent(Long studentId){return null;}


    public Project getProjectByKeyWords( List<String> keyWords){
        return null;
    }
    public Project getProjectByProjectType(@RequestParam("type") String type){
        return null;
    }
    public Project getProjectByStudent(@RequestParam("name") String name, @RequestParam("level") String level){return null;}

    public void addProject(@RequestParam("title") String title, List<String> keyWords){}
    public void assignProfessor(@RequestBody Prof supervisor){}
    public void changeStatus(@RequestParam("status") String status){}
    public void updateVersion(String title){}
    public void rateProject(int note){


                public void addKeywordtoProject (List < String > keywords, @RequestBody Project project){
                    String url = "http://localhost:3000/projects/addKeyword/{keywords}";
                    HttpEntity<Project> entity = new HttpEntity<>(project);
                    this.restTemplate.put(url, entity, keywords);
                }*/
    }
