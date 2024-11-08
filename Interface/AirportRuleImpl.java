package com.xworkz.Impl;

import com.xworkz.interf.AirportRule;

public class AirportRuleImpl implements AirportRule {
    @Override
    public boolean arriveBefore() {
        return true;
    }

    @Override
    public String idProof() {
        return "Adharcard";
    }
}
