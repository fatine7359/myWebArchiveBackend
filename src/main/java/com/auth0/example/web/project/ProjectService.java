package com.auth0.example.web.project;

import com.auth0.example.model.Projects.Project;
import com.auth0.example.model.Users.Prof;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

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
        String url = "http://localhost:8080/nodeServer/teachers/{teacherId}/projects";

        ResponseEntity<Project[]> response =
                restTemplate.getForEntity(
                        url,
                        Project[].class,
                        teacherId);

        Project[] projects = response.getBody();
        return Arrays.asList(projects);
    }


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

    }
}
