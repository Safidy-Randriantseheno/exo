package com.exercice.exo1.controller;

import com.exercice.exo1.model.TeamEntity;
import com.exercice.exo1.service.TeamService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class Teamcontroller {
    private TeamService teams;
    public List<TeamEntity> getteams(){
        return teams.getTeams();
    }

}
