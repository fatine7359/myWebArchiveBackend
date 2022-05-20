package com.auth0.example.web.project;

import com.auth0.example.model.Enums.StatusProjet;
import com.auth0.example.model.Enums.TypeProjet;
import com.auth0.example.model.Projects.Project;
import com.auth0.example.security.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
//@RequestMapping(path = "api/projects", produces = MediaType.APPLICATION_JSON_VALUE)
public class ProjectController {

    @Autowired
    private Utils utils;

    @Autowired
    private ProjectService projectService;


    @GetMapping(value = "/projects")
    public List<Project> getAllProjects(){
        return projectService.getAllProjects();
    }

    @GetMapping(value="/projects/{projectid}")
    public Project getProject(@PathVariable String projectid){
        return projectService.getProjectbyId(projectid);
    }

    @GetMapping("/teachers/{id}/projects")
    public List<Project> getAllProjectsSupervisedByTeacher(@PathVariable String id){
        return projectService.getAllProjectsTeacher(id);
    }

    @GetMapping("/students/{id}/projects")
    public List<Project> getAllProjectsByStudent(@PathVariable String id){
        return projectService.getProjectByStudent(id);
    }


    @GetMapping("/projects/{keywords}")
    public List<Project> getProjectsByKeyword(@PathVariable String keywords){
        return projectService.getProjectByKeyWords(keywords);
    }

    @GetMapping("/projects/{type}")
    public List<Project> getProjectsByType(@RequestParam TypeProjet type){
        return projectService.getProjectByProjectType(type);
    }


    @PostMapping(value="/addproject")
    @ResponseStatus(HttpStatus.CREATED)
    public void addProject(@RequestBody Project project){
        projectService.addProject(project);
    }

    // @PutMapping("/projects/changeStatus/{projectid}&{status}")
    //public void changeStatusOfProject(@RequestParam("projectid") Long projectid, @RequestParam("status") StatusProjet status){
    //  projectService.changeStatus(status,projectid);
    //}

    //@GetMapping(value="projects/{projectid}/{rate}")
    //public void rateProject(@RequestHeader String user, @RequestParam("projectid") Long projectid, @RequestParam )



}