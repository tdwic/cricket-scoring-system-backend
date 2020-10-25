package com.scoring.system.Repository;

import com.scoring.system.Entity.TeamEntity;
import org.springframework.data.repository.CrudRepository;

public interface TeamRepository extends CrudRepository<TeamEntity, Long> {
}
