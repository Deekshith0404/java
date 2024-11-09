package com.xworkz.Abstraction.Traffic;

public class TrafficRuleImpl implements TrafficRule
{
    @Override
    public boolean wearingHealmet() {
        return true;
    }

    @Override
    public int drivingSpeed() {
        return 70;
    }

    @Override
    public String modification() {
        return "yes";
    }
}
