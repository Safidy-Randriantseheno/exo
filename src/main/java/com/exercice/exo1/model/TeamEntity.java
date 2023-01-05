package com.exercice.exo1.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "team")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TeamEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_team;
    @Column(unique = true)
    private String name;
    @OneToMany(mappedBy =  "team")
    private List<PlayerEntity> players;
    @ManyToMany
    @JoinTable(
            name = "have",
            joinColumns  = @JoinColumn(name = "id_team"),
            inverseJoinColumns = @JoinColumn(name = "id_sponsor")

    )

    private List<SponsorEntity> sponsors;
    @ManyToMany
    @JoinTable(
            name = "play_against",
            joinColumns = @JoinColumn(name = "id_team_one"),
            inverseJoinColumns = @JoinColumn(name = "id_team_two")
    )
    private List<TeamEntity> teamEntities;
    @ManyToMany(mappedBy = "teamEntities")
    private List<TeamEntity> teams;


}
