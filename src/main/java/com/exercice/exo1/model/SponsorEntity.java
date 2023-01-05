package com.exercice.exo1.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "sponsor")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SponsorEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_sponsor;
    private String name;
    @ManyToMany(mappedBy = "sponsors")

    private List<TeamEntity> teams;
}
