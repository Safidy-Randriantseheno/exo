package com.exercice.exo1.repository;

import com.exercice.exo1.model.Play_againstEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Play_againstRepository extends JpaRepository<Play_againstEntity, Integer> {
}
