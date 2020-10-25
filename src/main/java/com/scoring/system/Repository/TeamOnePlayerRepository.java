package com.scoring.system.Repository;

import com.scoring.system.Entity.TeamOnePlayersEntity;
import org.springframework.data.repository.CrudRepository;

public interface TeamOnePlayerRepository extends CrudRepository<TeamOnePlayersEntity,Long> {
}
