package com.xworkz.Impl;

import com.xworkz.interf.TrafficPolice;

public class TrafficPoliceImpl implements TrafficPolice {
    @Override
    public boolean wearingHelmet() {
        return true;
    }

    @Override
    public int speedLimit() {
        return 50;
    }
}
