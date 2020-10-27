package com.scoring.system.Repository;

import com.scoring.system.Entity.TeamEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface TeamRepository extends JpaRepository<TeamEntity, Long> {
}
