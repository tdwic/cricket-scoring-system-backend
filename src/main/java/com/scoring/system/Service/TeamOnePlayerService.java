package com.scoring.system.Service;

import com.scoring.system.Entity.TeamOnePlayersEntity;
import com.scoring.system.Model.Player;
import com.scoring.system.Repository.TeamOnePlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TeamOnePlayerService {

    @Autowired
    private TeamOnePlayerRepository teamOnePlayerRepository;

    public List<TeamOnePlayersEntity> AddNewTeamOnePlayers(List<Player> playerList) {

        List<TeamOnePlayersEntity> teamOnePlayersEntityArrayList = new ArrayList<TeamOnePlayersEntity>();

        for (Player playerObj : playerList) {

            TeamOnePlayersEntity teamOnePlayersEntity = new TeamOnePlayersEntity();

            teamOnePlayersEntity.setPlayerID(playerObj.getPlayerID());
            teamOnePlayersEntity.setPlayerName(playerObj.getPlayerName());
            teamOnePlayersEntity.setPlayerTeamId(playerObj.getPlayerTeamId());
            teamOnePlayersEntity.setBattingStyle(playerObj.getBattingStyle());
            teamOnePlayersEntity.setBowlingStyle(playerObj.getBowlingStyle());

            teamOnePlayersEntityArrayList.add(teamOnePlayersEntity);

        }

        return (List<TeamOnePlayersEntity>) teamOnePlayerRepository.saveAll(teamOnePlayersEntityArrayList);
    }

    public List<TeamOnePlayersEntity> GetAllTeamOnePlayers() {
        return (List<TeamOnePlayersEntity>) teamOnePlayerRepository.findAll();
    }
}
