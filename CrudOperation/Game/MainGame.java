package com.xworks.CrudOperation.Game;

public class MainGame {
    private int gameSize;
    private String type;
    private int accontCreatedDate;
    private boolean isActive;

     public MainGame(){

    }

    public int getGameSize() {
        return gameSize;
    }

    public void setGameSize(int gameSize) {
        this.gameSize = gameSize;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAccontCreatedDate() {
        return accontCreatedDate;
    }

    public void setAccontCreatedDate(int accontCreatedDate) {
        this.accontCreatedDate = accontCreatedDate;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    @Override
    public String toString() {
        return "MainGame{" +
                "gameSize=" + gameSize +
                ", type='" + type + '\'' +
                ", accontCreatedDate=" + accontCreatedDate +
                ", isActive=" + isActive +
                '}';
    }
}
