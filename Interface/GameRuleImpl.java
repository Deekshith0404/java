package com.xworkz.Impl;

import com.xworkz.interf.GameRule;

public class GameRuleImpl implements GameRule {
    @Override
    public int playTime() {
        return 5;
    }

    @Override
    public int idNum() {
        return 01;
    }

    @Override
    public String passCode() {
        return "gamer12";
    }

    @Override
    public boolean legitPlayer() {
        return true;
    }
}
