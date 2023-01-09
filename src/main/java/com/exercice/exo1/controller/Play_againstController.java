package com.exercice.exo1.controller;

import com.exercice.exo1.model.Play_againstEntity;
import com.exercice.exo1.service.Play_againstService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class Play_againstController {
    private Play_againstService pa;
    @GetMapping("/pa")
    public List<Play_againstEntity> getPa() {
        return pa.getPa();
    }
}
