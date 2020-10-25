package com.scoring.system.Service;

import com.scoring.system.Entity.TeamEntity;
import com.scoring.system.Model.Team;
import com.scoring.system.Repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeamService {

    @Autowired
    private TeamRepository teamRepository;

    public TeamEntity NewTeam(Team team){

        TeamEntity teamEntity = new TeamEntity();

        teamEntity.setTeamID(team.getTeamID());
        teamEntity.setTeamName(team.getTeamName());
        teamEntity.setTeamLogoName(team.getTeamLogoName());

        return teamRepository.save(teamEntity);
    }

}
