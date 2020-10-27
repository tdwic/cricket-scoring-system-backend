package com.scoring.system.Service;

import com.scoring.system.Entity.MatchEntity;
import com.scoring.system.Model.Match;
import com.scoring.system.Repository.MatchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatchService {

    @Autowired
    private MatchRepository matchRepository;

    public MatchEntity NewMatch(Match match){
        MatchEntity matchEntity = new MatchEntity();

        matchEntity.setMatchId(match.getMatchId());
        matchEntity.setBattingTeamId(match.getBattingTeamId());
        matchEntity.setBowlingTeamId(match.getBowlingTeamId());
        matchEntity.setNoOfOvers(match.getNoOfOvers());

        return matchRepository.save(matchEntity);
    }

    public List<MatchEntity> GetMatchDetails(){
        return (List<MatchEntity>) matchRepository.findAll();
    }

}
