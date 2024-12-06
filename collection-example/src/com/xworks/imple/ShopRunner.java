package com.xworks.imple;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ShopRunner {
    public static void main(String[] args) {
        Shop shop;
        shop=()-> true;
        boolean result=shop.open();
        System.out.println("is the shop open :"+result);

        Market market;
        market=(time)-> time;
        int result1=market.OpenTime(10);
        System.out.println("the time that market opens is:"+result1);


        ArrayList<Integer> integers=new ArrayList<Integer>();
        integers.add(10);
        integers.add(7);
        integers.add(0);
        integers.add(15);
        integers.add(12);
        integers.add(11);
        integers.add(8);
        integers.add(3);
        integers.add(1);
        System.out.println("the size of the list"+integers.size());
        integers.forEach(a->System.out.println(a));

        ArrayList<String> arrayList1=new ArrayList<>(Arrays.asList("hello","there","getMe"));
        arrayList1.forEach(a-> System.out.println(a));
    }
}
