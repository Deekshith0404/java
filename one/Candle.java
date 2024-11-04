package com.xworkz.newAssign.one;

public class Candle {
    private String color;
    private int cost;
    private String perfume;


    public Candle(String color,int cost,String perfume){
        this.color=color;
        this.cost=cost;
        this.perfume=perfume;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj==null) return false;
        if (obj instanceof Candle){
            System.out.println("its same u can check");
            Candle cr7 =(Candle) obj;
            if (this.color.equals(cr7.color)&&this.cost==cr7.cost && this.perfume.equals(cr7.perfume)){
                System.out.println("both are equal");
                return true;
            }
            else {
                System.out.println("both are not equals");
                return false;
            }
        }

    return false;
    }

}
