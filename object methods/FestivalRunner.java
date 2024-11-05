package com.xworkz.newAssign.RunnerOfAssign;

import com.xworkz.newAssign.one.Festival;

public class FestivalRunner {
    public static void main(String[] args) {
        Festival fest=new Festival("Dipawali",31,"Rama");
        Festival fest1=new Festival("Dipawali",31,"Rama");

        Boolean check=fest.equals(fest1);
        System.out.println("the result is "+check);
    }
}
