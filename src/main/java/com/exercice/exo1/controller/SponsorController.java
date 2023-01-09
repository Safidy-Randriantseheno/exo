package com.exercice.exo1.controller;

import com.exercice.exo1.model.SponsorEntity;
import com.exercice.exo1.service.SponsorService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class SponsorController {
    private SponsorService sponsor;
    @GetMapping("/sponsors")
    public List<SponsorEntity> getSponsors() {
        return sponsor.getSponsors();
    }
}
