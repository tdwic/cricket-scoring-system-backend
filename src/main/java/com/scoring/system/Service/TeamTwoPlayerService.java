package com.scoring.system.Service;

import com.scoring.system.Entity.TeamOnePlayersEntity;
import com.scoring.system.Entity.TeamTwoPlayersEntity;
import com.scoring.system.Model.Player;
import com.scoring.system.Repository.TeamTwoPlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TeamTwoPlayerService {
    @Autowired
    private TeamTwoPlayerRepository teamTwoPlayerRepository;


    public List<TeamTwoPlayersEntity> AddNewTeamTwoPlayers(List<Player> playerList){

        List<TeamTwoPlayersEntity> teamOnePlayersEntityArrayList = new ArrayList<TeamTwoPlayersEntity>();

        for (Player playerObj : playerList){

            TeamTwoPlayersEntity teamTwoPlayersEntity = new TeamTwoPlayersEntity();

            teamTwoPlayersEntity.setPlayerID(playerObj.getPlayerID());
            teamTwoPlayersEntity.setPlayerName(playerObj.getPlayerName());
            teamTwoPlayersEntity.setPlayerTeamId(playerObj.getPlayerTeamId());
            teamTwoPlayersEntity.setBattingStyle(playerObj.getBattingStyle());
            teamTwoPlayersEntity.setBowlingStyle(playerObj.getBowlingStyle());

            teamOnePlayersEntityArrayList.add(teamTwoPlayersEntity);

        }

        return (List<TeamTwoPlayersEntity>) teamTwoPlayerRepository.saveAll(teamOnePlayersEntityArrayList);
    }

    public List<TeamTwoPlayersEntity> GetAllTeamTwoPlayers() {
        return (List<TeamTwoPlayersEntity>) teamTwoPlayerRepository.findAll();
    }

}
