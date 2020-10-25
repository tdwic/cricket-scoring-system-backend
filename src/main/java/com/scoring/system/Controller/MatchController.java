package com.scoring.system.Controller;

import com.scoring.system.Entity.MatchEntity;
import com.scoring.system.Model.Match;
import com.scoring.system.Service.MatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/")
public class MatchController {

    @Autowired
    private MatchService matchService;

    @RequestMapping(value = "match", method = RequestMethod.POST)
    public MatchEntity NewMatch(@RequestBody Match match){
        return matchService.NewMatch(match);
    }

}
