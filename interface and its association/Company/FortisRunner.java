package com.xworkz.Abstraction.Company;

public class FortisRunner {
    public static void main(String[] args) {
        Hospital hospital=new RajKumarRoadHospital();
        Fortis fortis=new Fortis(hospital);
        fortis.checkHos();
    }
}
