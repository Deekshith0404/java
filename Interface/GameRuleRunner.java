package com.xworkz.implRunner;

import com.xworkz.Impl.GameRuleImpl;

public class GameRuleRunner {
    public static void main(String[] args) {
        GameRuleImpl game=new GameRuleImpl();
        int ply=game.playTime();
        int idd=game.idNum();
        String pass= game.passCode();
        boolean legit= game.legitPlayer();

        System.out.println("the time player played game in hours :"+ply);
        System.out.println("the id of the player is :"+idd);
        System.out.println("the pass word is :"+pass);
        System.out.println("is the player legit :"+legit);
    }
}
