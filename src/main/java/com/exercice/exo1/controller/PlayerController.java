package com.exercice.exo1.controller;

import com.exercice.exo1.model.PlayerEntity;
import com.exercice.exo1.service.PlayerService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor

public class PlayerController {
    private PlayerService Player;

    @GetMapping("/Players")
    public List<PlayerEntity> getPlayers() {
        return Player.getPlayers();
    }
}
