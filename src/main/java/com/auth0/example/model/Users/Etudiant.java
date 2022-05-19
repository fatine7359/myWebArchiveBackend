//package com.auth0.example.model.Users;
//
//import com.auth0.example.model.Enums.NiveauEtudes;
//
//public class Etudiant extends User {
//	private String mle;
//	private NiveauEtudes niveauEtudes;
//
//	public Etudiant(String uid, String email, String displayName, String imageUrl, String mle) {
//		super(uid, email, displayName, imageUrl);
//		this.mle = mle;
//		this.niveauEtudes = NiveauEtudes.BAC3;
//	}
//
//	public Etudiant(String uid, String email, String displayName, String imageUrl, String mle, NiveauEtudes niveauEtudes) {
//		super(uid, email, displayName, imageUrl);
//		this.mle = mle;
//		this.niveauEtudes = NiveauEtudes.BAC3;
//		this.niveauEtudes = niveauEtudes;
//	}
//
//	public String getMle() {
//		return mle;
//	}
//
//	// TODO: needs to affect db
//	public void setMle(String mle) {
//		this.mle = mle;
//	}
//
//	public NiveauEtudes getNiveauEtudes() {
//		return niveauEtudes;
//	}
//
//	// TODO: needs to affect db
//	public void setNiveauEtudes(NiveauEtudes niveauEtudes) {
//		this.niveauEtudes = niveauEtudes;
//	}
//
//}
