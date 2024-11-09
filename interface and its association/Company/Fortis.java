package com.xworkz.Abstraction.Company;

public class Fortis {
    Hospital hospital;

    Fortis(Hospital hospital){
        this.hospital=hospital;
    }

    public void checkHos(){
        boolean ch=hospital.clean();
        if (ch){
            System.out.println("the hospital is clean");
        }
        else {
            System.out.println("the hospital is not clean");
        }

    }
}
