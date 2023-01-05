package com.exercice.exo1.repository;

import com.exercice.exo1.model.SponsorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SponsorRepository extends JpaRepository<SponsorEntity, Integer> {
}
