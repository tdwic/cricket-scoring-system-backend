package com.scoring.system.Service;

import com.scoring.system.Entity.PlayerEntity;
import com.scoring.system.Model.Player;
import com.scoring.system.Repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PlayerService {
    @Autowired
    private PlayerRepository playerRepository;


    public List<PlayerEntity> AddNewPlayers(List<Player> playerList){

        List<PlayerEntity> PlayersEntityArrayList = new ArrayList<PlayerEntity>();

        for (Player playerObj : playerList){

            PlayerEntity playerEntity = new PlayerEntity();

            playerEntity.setPlayerID(playerObj.getPlayerID());
            playerEntity.setPlayerName(playerObj.getPlayerName());
            playerEntity.setPlayerTeamId(playerObj.getPlayerTeamId());
            playerEntity.setBattingStyle(playerObj.getBattingStyle());
            playerEntity.setBowlingStyle(playerObj.getBowlingStyle());

            PlayersEntityArrayList.add(playerEntity);

        }

        return (List<PlayerEntity>) playerRepository.saveAll(PlayersEntityArrayList);
    }

    public List<PlayerEntity> GetAllPlayers() {
        return (List<PlayerEntity>) playerRepository.findAll();
    }

    public List<PlayerEntity> GetAllPlayersByPlayerTeamId(Long teamId){
        return playerRepository.findByPlayerTeamId(teamId);
    }

}
