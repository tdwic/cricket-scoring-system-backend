package com.scoring.system.Model;

public class Team {
    private Long teamID;
    private String teamName;
    private String teamLogoName;

    public Team() {
    }

    public Long getTeamID() {
        return teamID;
    }

    public void setTeamID(Long teamID) {
        this.teamID = teamID;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamLogoName() {
        return teamLogoName;
    }

    public void setTeamLogoName(String teamLogoName) {
        this.teamLogoName = teamLogoName;
    }
}
