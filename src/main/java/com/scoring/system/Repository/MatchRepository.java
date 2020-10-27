package com.scoring.system.Repository;

import com.scoring.system.Entity.MatchEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface MatchRepository extends JpaRepository<MatchEntity, Long> {
}
