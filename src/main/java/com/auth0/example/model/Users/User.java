package com.auth0.example.model.Users;

import com.auth0.example.model.Enums.PermissionLevel;

public class User {
	private String uid;
	private String email;
	private String displayName;
	private String imageUrl;
	//private final List<Reclamation> reclamations = new ArrayList<Reclamation>(); // ommited by lombok

	public User(String uid, String email, String displayName, String imageUrl) {
		setUid(uid);
		setEmail(email);
		setDisplayName(displayName);
		setImageUrl(imageUrl);
	}

	public String getUid() {
		return uid;
	}

	// TODO: needs to affect db
	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDisplayName() {
		return displayName;
	}

	// TODO: needs to affect db
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}


	public static PermissionLevel getDBPermissionLevel(String uid) {
		return null;
	}

	public static Boolean getDBIsTeacher(String uid) {
		return null;
	}

}
