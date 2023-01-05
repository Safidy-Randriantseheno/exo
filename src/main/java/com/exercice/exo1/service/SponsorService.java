package com.exercice.exo1.service;

import com.exercice.exo1.model.SponsorEntity;
import com.exercice.exo1.repository.SponsorRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class SponsorService {
    private SponsorRepository sponsor;
    public List<SponsorEntity> getSponsors(){
        return sponsor.findAll();
    }
}
