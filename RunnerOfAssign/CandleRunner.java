package com.xworkz.newAssign.RunnerOfAssign;

import com.xworkz.newAssign.one.Candle;

public class CandleRunner {
    public static void main(String[] args) {
        Candle can1=new Candle("blue",100,"park avenue");
        Candle can2=new Candle("blue",100,"park avenue");


        boolean check=can1.equals(can2);
        System.out.println("the result is "+check);
    }
}
