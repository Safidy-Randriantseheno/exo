package com.exercice.exo1.service;

import com.exercice.exo1.model.Play_againstEntity;
import com.exercice.exo1.repository.Play_againstRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class Play_againstService {
    private Play_againstRepository pa;
    public List<Play_againstEntity> getPa() {
        return pa.findAll();
    }
}
