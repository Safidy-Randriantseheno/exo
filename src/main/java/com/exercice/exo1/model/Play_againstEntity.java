package com.exercice.exo1.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "play_against")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Play_againstEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_play_against;
    private Date datetime;
    private String Stadium;
}
