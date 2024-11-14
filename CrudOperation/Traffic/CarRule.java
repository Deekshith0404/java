package com.xworks.CrudOperation.Traffic;

public class CarRule {
    Traffic traffic[]=new Traffic[5];
    int index;

    public String saveDetails(Traffic traffic1){
        if (traffic!=null){
            traffic[index]=traffic1;
            index++;
        }
        return "data saved";
    }

    public  void read(){
        for (int i = 0; i < traffic.length; i++) {
            System.out.println(traffic[i]);
        }
    }

    public void checkSpeed(int speed){
        for (int i = 0; i < traffic.length; i++) {
            if (traffic[i].getSpeed()<speed){
                System.out.println("these are under speed limit");
                System.out.println(traffic[i]);
            }
        }
    }

    public void checkbelt(boolean d){
        for (int i = 0; i < traffic.length; i++) {
            if (traffic[i].isWearingSeatBelt()==d){
                System.out.println("thers are wearing seat belts");
                System.out.println(traffic[i]);
            }

        }
    }

    public void checkExp(){
        for (int i = 0; i < traffic.length; i++) {
            if (traffic[i].getYearOfExp()>15){
                System.out.println("experienced driver ");
                System.out.println(traffic[i]);
            } else{
                System.out.println("new driver");
                System.out.println(traffic[i]);
            }
        }
    }

}
