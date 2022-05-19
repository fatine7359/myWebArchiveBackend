//package com.auth0.example.model.Projects;
//
//import java.util.ArrayList;
//import java.util.Collection;
//import java.util.List;
//
//import com.auth0.example.model.Enums.StatusProjet;
//import com.auth0.example.model.Enums.TypeProjet;
//import com.auth0.example.model.Users.Groupe;
//import com.auth0.example.model.Users.Prof;
//
//public class Project {
//	private String titre;
//	private int note;
//	private List<String> motsCles = new ArrayList<String>();
//	private List<Version> versions = new ArrayList<Version>();
//	private List<Groupe> groupes = new ArrayList<Groupe>();
//	//a discuter
//	private Prof supervisor;
//	private StatusProjet projectStatus;
//	private TypeProjet projectType;
//
//	public Project(String titre, Collection<String> motsCles) {
//		this.titre = titre;
//		this.addMotCles(motsCles);
//	}
//
//	public void addMotCles(Collection<String> m) {
//		m.stream().forEach(motsCles::add);
//	}
//
//	public void addVersion(Version version) {
//		versions.add(version);
//	}
//
//	public void addGroupe(Groupe groupe) {
//		groupes.add(groupe);
//	}
//
//	public String getTitre() {
//		return titre;
//	}
//
//	public void setTitre(String titre) {
//		this.titre = titre;
//	}
//
//	public int getNote() {
//		return note;
//	}
//
//	public void setNote(int note) {
//		this.note = note;
//	}
//
//	public List<String> getMotsCles() {
//		return motsCles;
//	}
//
//	public void setMotsCles(List<String> motsCles) {
//		this.motsCles = motsCles;
//	}
//
//	public List<Version> getVersions() {
//		return versions;
//	}
//
//	public void setVersions(List<Version> versions) {
//		this.versions = versions;
//	}
//
//	public List<Groupe> getGroupes() {
//		return groupes;
//	}
//
//	public void setGroupes(List<Groupe> groupes) {
//		this.groupes = groupes;
//	}
//
//	public Prof getSupervisor() {
//		return supervisor;
//	}
//
//	public void setSupervisor(Prof supervisor) {
//		this.supervisor = supervisor;
//	}
//
//	public StatusProjet getProjectStatus() {
//		return projectStatus;
//	}
//
//	public void setProjectStatus(StatusProjet projectStatus) {
//		this.projectStatus = projectStatus;
//	}
//
//	public TypeProjet getProjectType() {
//		return projectType;
//	}
//
//	public void setProjectType(TypeProjet projectType) {
//		this.projectType = projectType;
//	}
//}
