package com.auth0.example.web.project;


import com.auth0.example.model.Projects.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.auth0.example.model.Projects.Project;

@RestController
//@RequestMapping(path = "api/projects", produces = MediaType.APPLICATION_JSON_VALUE)
public class ProjectController {



    private ProjectService projectService;

    public ProjectController(ProjectService projectService){
        this.projectService = projectService;
    }


    /*@GetMapping(value = "/projects")
    public List<Project> getAllProjects(){
        return projectService.getAllProjects();
    }*/

    /*@GetMapping("/teachers/{id}/projects")
    public List<Project> getAllProjectsSupervisedByTeacher(@PathVariable Long id){
        return projectService.getAllProjectsTeacher(id);
    }

    @GetMapping("/students/{id}/projects")
    public List<Project> getAllProjectsByStudent(@PathVariable Long id){
        return projectService.getAllProjectsStudent(id);
    }

//    private ProjectService projectService;
//    
//    @GetMapping(value="/getAll")
//    public List<Project> getAllProjects(){
//    	return projectService.getAllProjects();
//    }
//    
//    @GetMapping(value="/getuser/{keyWords}")
//    public Project[] getProjectByKeyWords(@RequestParam List<String> keyWords){
//    	return projectService.getProjectByKeyWords(keyWords);
//    }
    
//    @GetMapping(value="/getuser/{name}&{level}")
//    public */

}
