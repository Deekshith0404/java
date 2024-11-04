package com.xworkz.newAssign.one;

public class Festival {
    private String name;
    private int date;
    private String maingod;

    public Festival(String name,int date,String maingod){
        this.date=date;
        this.maingod=maingod;
        this.name=name;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==null){
            System.out.println("the oblect is null");
            return false;
        }
        if(obj instanceof Festival){
            Festival fes=(Festival) obj;
            System.out.println("its same u CAN compare");
            if (this.date== fes.date &&this.name.equals(fes.name)&& this.maingod.equals(fes.maingod)) return true;
            else System.out.println("the festival are not same");
        }
        return false;
    }
}
