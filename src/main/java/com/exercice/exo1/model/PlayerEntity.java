package com.exercice.exo1.model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "player")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PlayerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_player;
    @Column(unique = true)
    private String name;
    @Column(unique = true)
    private int number;
    @ManyToOne
    @JoinColumn(name ="team")
    private TeamEntity team;

}
