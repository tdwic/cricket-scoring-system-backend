package com.scoring.system.Controller;

import com.scoring.system.Entity.PlayerEntity;
import com.scoring.system.Model.Player;
import com.scoring.system.Service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/")
public class PlayerController {


    @Autowired
    private PlayerService playerService;


    @RequestMapping(value = "players" , method = RequestMethod.POST)
    public List<PlayerEntity> AddNewTeamOnePlayers(@RequestBody List<Player> palyerList){
        return playerService.AddNewPlayers(palyerList);
    }

    @RequestMapping(value = "players" , method = RequestMethod.GET)
    public List<PlayerEntity> GetAllPlayers(){
        return playerService.GetAllPlayers();
    }


    @RequestMapping(value = "players/{id}" , method = RequestMethod.GET)
    public List<PlayerEntity> FindPlayersByTeamId(@PathVariable Long id){
        return playerService.GetAllPlayersByPlayerTeamId(id);
    }


}
