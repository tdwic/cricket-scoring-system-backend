package com.scoring.system.Controller;

import com.scoring.system.Entity.TeamEntity;
import com.scoring.system.Model.Team;
import com.scoring.system.Service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/")
public class TeamController {

    @Autowired
    private TeamService teamService;

    @RequestMapping(value = "team", method = RequestMethod.POST)
    public TeamEntity NewTeam(@RequestBody Team team){
        return teamService.NewTeam(team);
    }

}
