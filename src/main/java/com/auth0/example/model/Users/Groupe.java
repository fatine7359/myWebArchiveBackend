package com.auth0.example.model.Users;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.auth0.example.model.Projects.Project;

import lombok.Data;

@Data
public class Groupe {
    private String id;
    private List<Etudiant> membres = new ArrayList<>();
    private List<Project> projects = new ArrayList<>();
}