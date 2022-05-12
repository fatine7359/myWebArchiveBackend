package com.auth0.example.web.Reclamation;

import com.auth0.example.model.Enums.StatusReclamation;
import com.auth0.example.model.Reclamation.Reclamation;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;


@Service
public class ReclamationService {

    private Reclamation reclamation;

    public List<Reclamation> listReclamations(){
        List<Reclamation> recs= new ArrayList<>(); //get xml data of reclamations for the admin
        return null ;
    }

    public void create(Reclamation r ) {

    }
    public void changeStatus(@RequestParam("status") StatusReclamation status, Reclamation r){

    }

    public void postReclamation(Reclamation r){

    }

    public List<Reclamation> getReclamationbyUser(@RequestParam("displayName") String displayName){
        return null;
    }

   public List<Reclamation> getReclamationbyStatus(@RequestParam("status") StatusReclamation status){
        return null;
   }


}
