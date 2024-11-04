package com.xworkz.newAssign.RunnerOfAssign;

import com.xworkz.newAssign.one.Mic;

public class MicRunner {
    public static void main(String[] args) {
        Mic mic1=new Mic("JBL",25,5000);
        Mic mic2=new Mic("JBL",25,5000);

        boolean check =mic1.equals(mic2);
        System.out.println(check);
    }
}
