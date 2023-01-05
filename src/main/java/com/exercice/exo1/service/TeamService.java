package com.exercice.exo1.service;

import com.exercice.exo1.model.TeamEntity;
import com.exercice.exo1.repository.TeamRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TeamService {
    private TeamRepository team;
    public List<TeamEntity> getTeams() {
        return team.findAll();
    }
}
