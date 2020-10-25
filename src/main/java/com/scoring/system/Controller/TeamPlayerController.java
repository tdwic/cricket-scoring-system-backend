package com.scoring.system.Controller;

import com.scoring.system.Entity.TeamOnePlayersEntity;
import com.scoring.system.Entity.TeamTwoPlayersEntity;
import com.scoring.system.Model.Player;
import com.scoring.system.Service.TeamOnePlayerService;
import com.scoring.system.Service.TeamTwoPlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/")
public class TeamPlayerController {

    @Autowired
    private TeamOnePlayerService teamOnePlayerService;

    @Autowired
    private TeamTwoPlayerService teamTwoPlayerService;

    @RequestMapping(value = "teamOnePlayers" , method = RequestMethod.POST)
    public List<TeamOnePlayersEntity> AddNewTeamOnePlayers(@RequestBody List<Player> palyerList){
        return teamOnePlayerService.AddNewTeamOnePlayers(palyerList);
    }

    @RequestMapping(value = "teamTwoPlayers" , method = RequestMethod.POST)
    public List<TeamTwoPlayersEntity> AddNewTeamTwoPlayers(@RequestBody List<Player> palyerList){
        return teamTwoPlayerService.AddNewTeamTwoPlayers(palyerList);
    }


}
