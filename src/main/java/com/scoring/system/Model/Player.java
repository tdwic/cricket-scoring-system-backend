package com.scoring.system.Model;

public class Player {

    private Long playerID;
    private String playerName;
    private Long playerTeamId;
    private String battingStyle;
    private String bowlingStyle;

    public Player() {
    }

    public Long getPlayerID() {
        return playerID;
    }

    public void setPlayerID(Long playerID) {
        this.playerID = playerID;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public Long getPlayerTeamId() {
        return playerTeamId;
    }

    public void setPlayerTeamId(Long playerTeamId) {
        this.playerTeamId = playerTeamId;
    }

    public String getBattingStyle() {
        return battingStyle;
    }

    public void setBattingStyle(String battingStyle) {
        this.battingStyle = battingStyle;
    }

    public String getBowlingStyle() {
        return bowlingStyle;
    }

    public void setBowlingStyle(String bowlingStyle) {
        this.bowlingStyle = bowlingStyle;
    }
}
