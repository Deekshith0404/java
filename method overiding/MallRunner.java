package com.xworkz.TheRunner;

import com.xworkz.assign2.LuluMall;
import com.xworkz.assign2.MantriMall;
import com.xworkz.assign2.OrionMall;
import com.xworkz.assignment.Mall;

public class MallRunner {
    public static void main(String[] args) {
        Mall mall = new OrionMall();
        OrionMall orionMall=new OrionMall();
        mall.open();
        mall.close();
        mall.elevation();
        mall.securuty();
        orionMall.populat();

        System.out.println("==============================");

        Mall mall1=new LuluMall();
        LuluMall luluMall=new LuluMall();
        mall1.open();
        mall1.close();
        mall1.elevation();
        mall1.securuty();
        luluMall.place();
        System.out.println("======================================");

        Mall mall2=new MantriMall();
        MantriMall mantriMall=new MantriMall();
        mall1.open();
        mall1.close();
        mall1.elevation();
        mall1.securuty();
        mantriMall.hype();
        System.out.println("=========================================");




    }
}
