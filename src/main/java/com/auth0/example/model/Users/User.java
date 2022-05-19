package com.auth0.example.model.Users;

import com.auth0.example.model.Enums.PermissionLevel;

public class User {
	private String uid;
	private String displayName;
	private String imageUrl;
	private String mle;
	private String type;
	private String niveauetudes;
	
	public User(String uid, String displayName, String imageUrl, String mle, String type,
			String niveauetudes) {
		super();
		this.uid = uid;
		this.displayName = displayName;
		this.imageUrl = imageUrl;
		this.mle = mle;
		this.type = type;
		this.niveauetudes = niveauetudes;
	}

	public String getMle() {
		return mle;
	}

	public void setMle(String mle) {
		this.mle = mle;
	}

	public String getNiveauetudes() {
		return niveauetudes;
	}

	public void setNiveauetudes(String niveauetudes) {
		this.niveauetudes = niveauetudes;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getUid() {
		return uid;
	}

	// TODO: needs to affect db
	public void setUid(String uid) {
		this.uid = uid;
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
