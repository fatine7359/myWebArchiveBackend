package com.auth0.example.model.Projects;
//
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NonNull;
//
//@Data
//@AllArgsConstructor
//public class Version {
//	@NonNull
//	private String commentaire;
//	@NonNull
//	private String contenu;
//	@NonNull
//	private Project project;
//}

import com.auth0.example.model.Comment;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Version {
    public String uid;
    public String publisher;
    public String numero;
    public String description;
    public Comment comments;
    public String contenu;



}
