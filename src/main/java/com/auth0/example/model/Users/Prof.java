//package com.auth0.example.model.Users;
//
//import java.util.ArrayList;
//import java.util.Collection;
//import java.util.List;
//
//import com.auth0.example.model.Enums.DomainesExpertise;
//
//public class Prof extends User {
//	private List<DomainesExpertise> domainesExpertise = new ArrayList<DomainesExpertise>();
//
//	public Prof(String uid, String email, String displayName, String imageUrl, Collection<DomainesExpertise> domainesExpertise) {
//		super(uid, email, displayName, imageUrl);
//		addDomainesExpertise(domainesExpertise);
//	}
//
//	public void addDomainesExpertise(Collection<DomainesExpertise> d) {
//		d.stream().forEach(domainesExpertise::add);
//	}
//
//}
