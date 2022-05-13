package com.auth0.example.model;

import java.time.LocalDate;

import com.auth0.example.model.Enums.StatusReclamation;
import com.auth0.example.model.Users.Admin;
import com.auth0.example.model.Users.User;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Reclamation {
	private LocalDate date;
	private String description;
	private User user;
	private Admin admin;
	private StatusReclamation statusReclamation;

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	public StatusReclamation getStatusReclamation() {
		return statusReclamation;
	}

	public void setStatusReclamation(StatusReclamation statusReclamation) {
		this.statusReclamation = statusReclamation;
	}
}
