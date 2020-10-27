package com.scoring.system.Repository;

import com.scoring.system.Entity.PlayerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PlayerRepository extends JpaRepository<PlayerEntity, Long> {

    List<PlayerEntity> findByPlayerTeamId(Long playerTeamId);

}
