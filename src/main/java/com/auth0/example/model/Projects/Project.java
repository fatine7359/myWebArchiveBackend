package com.auth0.example.model.Projects;
import com.auth0.example.model.Comment;
import com.auth0.example.model.Version;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Project {
//	private Long uid;
//	private String titre;
//	private int note;
//	private String description ;
//	private List<String> motsCles = new ArrayList<String>();
//	private List<Version> versions = new ArrayList<Version>();
//	private List<Etudiant> etudiants = new ArrayList<Etudiant>();
//	private List<Comments> comments = new ArrayList<Comments>();
//	//a discuter
//	private Prof supervisor;
//	private StatusProjet projectStatus;
//	private TypeProjet projectType;


    public String uid;
    public String titre;
    public int note;
    public String description;
    public Motscles motscles;
    public Comment comment;
    public Versions versions;
    public Membres membres;
    public String profId;
    public String status;
    public String type;



    public class Membres{
        public ArrayList<String> uid;
    }

    public class Motscles{
        public ArrayList<String> motcle;
    }

    public class Versions{
        public ArrayList<Version> version;
    }


}