package com.xworkz.newAssign.one;

public class Mic {
    private String brand;
    private int wireLength;
    private int cost;

    public Mic(String brand,int wireLength,int cost){
        this.brand=brand;
        this.cost=cost;
        this.wireLength=wireLength;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj==null) return false;

        if(obj instanceof Mic){
            System.out.println("its same u can compare");
            Mic cons=(Mic) obj;
            if (this.brand.equals(cons.brand) && this.wireLength == cons.wireLength && this.cost == cons.cost) return true;
            else return false;
        }
        return false;
    }
}
