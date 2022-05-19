//package com.auth0.example.model.Users;
//
//import java.util.ArrayList;
//import java.util.Collection;
//import java.util.List;
//
//import com.auth0.example.model.Projects.Project;
//
//import lombok.Data;
//
//@Data
//public class Groupe {
//	private String id;
//	private List<Etudiant> membres = new ArrayList<>();
//	private List<Project> projects = new ArrayList<>();
//
//	public Groupe(String id, List<Etudiant> membres, List<Project> projects) {
//		super();
//		this.id = id;
//		this.membres = membres;
//		this.projects = projects;
//	}
//
//	public String getId() {
//		return id;
//	}
//
//	public void setId(String id) {
//		this.id = id;
//	}
//
//	public List<Etudiant> getMembres() {
//		return membres;
//	}
//
//	public void setMembres(List<Etudiant> membres) {
//		this.membres = membres;
//	}
//
//	public List<Project> getProjects() {
//		return projects;
//	}
//
//	public void setProjects(List<Project> projects) {
//		this.projects = projects;
//	}
//
//	// TODO: needs to affect db
//	public void addMembres(Collection<Etudiant> m) {
//		m.stream().forEach(membres::add);
//	}
//
//	// TODO: needs to affect db
//	public void addProject(Collection<Project> p) {
//		p.stream().forEach(projects::add);
//	}
//}
