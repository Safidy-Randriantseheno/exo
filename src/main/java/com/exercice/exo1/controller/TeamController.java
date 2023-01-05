package com.exercice.exo1.controller;

import com.exercice.exo1.model.TeamEntity;
import com.exercice.exo1.service.TeamService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class TeamController {
    private TeamService teams;
    @GetMapping("teams")
    public List<TeamEntity> getTeams(){
        return teams.getTeams();
    }

}
