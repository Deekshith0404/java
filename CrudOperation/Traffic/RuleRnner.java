package com.xworks.CrudOperation.Traffic;

public class RuleRnner {
    public static void main(String[] args) {
        Traffic traffic=new Traffic();
        traffic.setWearingSeatBelt(true);
        traffic.setSpeed(120);
        traffic.setYearOfExp(12);
        traffic.setHasLicence(true);

        Traffic traffic1=new Traffic();
        traffic1.setWearingSeatBelt(false);
        traffic1.setSpeed(50);
        traffic1.setYearOfExp(25);
        traffic1.setHasLicence(true);

        Traffic traffic2=new Traffic();
        traffic2.setWearingSeatBelt(true);
        traffic2.setSpeed(100);
        traffic2.setYearOfExp(19);
        traffic2.setHasLicence(false);

        Traffic traffic3=new Traffic();
        traffic3.setWearingSeatBelt(false);
        traffic3.setSpeed(25);
        traffic3.setYearOfExp(50);
        traffic3.setHasLicence(false);

        Traffic traffic4=new Traffic();
        traffic4.setWearingSeatBelt(true);
        traffic4.setSpeed(35);
        traffic4.setYearOfExp(9);
        traffic4.setHasLicence(true);


        CarRule carRule=new CarRule();
        String detail1=carRule.saveDetails(traffic);
        System.out.println(detail1);

        String detail2=carRule.saveDetails(traffic1);
        System.out.println(detail2);

        String detail3=carRule.saveDetails(traffic2);
        System.out.println(detail3);

        String detail4=carRule.saveDetails(traffic3);
        System.out.println(detail4);

        String detail5=carRule.saveDetails(traffic4);
        System.out.println(detail5);

        carRule.read();
        System.out.println("----------------------");
        carRule.checkbelt(true);
        System.out.println("----------------");
        carRule.checkSpeed(50);
        System.out.println("----------------");
        carRule.checkExp();
    }
}
