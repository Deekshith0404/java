package com.xworkz.newAssign.RunnerOfAssign;

import com.xworkz.newAssign.one.Cracker;

public class CrackerRunner {
    public static void main(String[] args) {
        Cracker cracker=new Cracker("rocket",100);
        Cracker cracker1=new Cracker("rocket",100);


        boolean check=cracker.equals(cracker1);
        System.out.println("the result is "+check);
    }
}
