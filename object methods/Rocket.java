package com.xworkz.newAssign.one;

public class Rocket {
    private String company;
    private int budget;
    private String ceoName;


    public Rocket(String company,int budget,String ceoName){
        this.budget=budget;
        this.ceoName=ceoName;
        this.company=company;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj==null) return  false;
        if(obj instanceof Rocket){
            Rocket rock=(Rocket) obj;
            System.out.println("its inherited");
            if (this.company.equals(rock.company)&&this.budget==rock.budget && this.ceoName.equals(rock.ceoName)){
                System.out.println("both are same");
                return true;
            }
            else {
                System.out.println("both are different");
                return false;
            }
        }

        return  false;
    }
}
