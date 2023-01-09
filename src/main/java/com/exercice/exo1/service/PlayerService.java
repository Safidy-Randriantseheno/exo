package com.exercice.exo1.service;

import com.exercice.exo1.model.PlayerEntity;
import com.exercice.exo1.repository.PlayerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PlayerService {
    private PlayerRepository Player;
    public List<PlayerEntity> getPlayers() {
        return Player.findAll();
    }

}
