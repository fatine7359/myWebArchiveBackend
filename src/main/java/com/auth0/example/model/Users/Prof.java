package com.auth0.example.model.Users;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.auth0.example.model.Enums.DomainesExpertise;
import lombok.Data;

@Data
public class Prof extends User {
    private List<DomainesExpertise> domainesExpertise = new ArrayList<DomainesExpertise>();

    public void addDomainesExpertise(Collection<DomainesExpertise> d) {
        d.stream().forEach(domainesExpertise::add);
    }

}