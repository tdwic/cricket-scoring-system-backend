package com.scoring.system.Controller;

import com.scoring.system.Entity.TeamEntity;
import com.scoring.system.Model.Team;
import com.scoring.system.Service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/")
public class TeamController {

    @Autowired
    private TeamService teamService;

    //PostMethod
    @RequestMapping(value = "team", method = RequestMethod.POST)
    public TeamEntity NewTeam(@RequestBody Team team){
        return teamService.NewTeam(team);
    }
    //PostMethod

    //GetMethod
    @RequestMapping(value = "team", method = RequestMethod.GET)
    public List<TeamEntity> GetAllTeams(){
        return teamService.GetAllTeams();
    }
    //GetMethod

}
