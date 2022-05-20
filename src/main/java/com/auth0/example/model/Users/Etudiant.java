package com.auth0.example.model.Users;

import com.auth0.example.model.Enums.NiveauEtudes;
import lombok.Data;

@Data
public class Etudiant extends User {
    private String mle;
    private NiveauEtudes niveauEtudes;



}