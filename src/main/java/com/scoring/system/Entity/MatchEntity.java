package com.scoring.system.Entity;

import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class MatchEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @javax.persistence.Id
    private Long matchId;
    private Long battingTeamId;
    private Long bowlingTeamId;
    private int noOfOvers;

    public Long getMatchId() {
        return matchId;
    }

    public void setMatchId(Long matchId) {
        this.matchId = matchId;
    }

    public Long getBattingTeamId() {
        return battingTeamId;
    }

    public void setBattingTeamId(Long battingTeamId) {
        this.battingTeamId = battingTeamId;
    }

    public Long getBowlingTeamId() {
        return bowlingTeamId;
    }

    public void setBowlingTeamId(Long bowlingTeamId) {
        this.bowlingTeamId = bowlingTeamId;
    }

    public int getNoOfOvers() {
        return noOfOvers;
    }

    public void setNoOfOvers(int noOfOvers) {
        this.noOfOvers = noOfOvers;
    }
}
