package com.xworks.colllexamp.examp;

import java.io.Serializable;

public class IplTeamDto implements Serializable {

    private String teamName;
    private int numberOfPlayers;
    private String ownerName;
    private String sponser;
    private double budget;

     public IplTeamDto(){

    }

    public IplTeamDto(String teamName, int numberOfPlayers, String ownerName, String sponser, double budget) {
        this.teamName = teamName;
        this.numberOfPlayers = numberOfPlayers;
        this.ownerName = ownerName;
        this.sponser = sponser;
        this.budget = budget;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public int getNumberOfPlayers() {
        return numberOfPlayers;
    }

    public void setNumberOfPlayers(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getSponser() {
        return sponser;
    }

    public void setSponser(String sponser) {
        this.sponser = sponser;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    @Override
    public String toString() {
        return "IplTeamDto{" +
                "teamName='" + teamName + '\'' +
                ", numberOfPlayers=" + numberOfPlayers +
                ", ownerName='" + ownerName + '\'' +
                ", sponser='" + sponser + '\'' +
                ", budget=" + budget +
                '}';
    }

//    @Override
//    public boolean equals(Object obj) {
//        if (obj!=null){
//            if (obj instanceof IplTeamDto){
//                IplTeamDto dto=(IplTeamDto) obj;
//                if (getOwnerName().equals(dto.getOwnerName())){
//                    return true;
//                }
//            }
//        }
//        return false;
//    }
}
