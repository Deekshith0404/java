package com.xworks.equalsmethods.Runner;

import com.xworks.equalsmethods.example.BagDto;

public class BagRunner {
    public static void main(String[] args) {
        BagDto bagDto=new BagDto();
        bagDto.setBrand("puma");
        bagDto.setCapacityInKg(2);
        bagDto.setPrice(500);
        bagDto.setLengthInFeet("3ft");


        BagDto bagDto1=new BagDto();
        bagDto1.setLengthInFeet("3ft");
        bagDto1.setPrice(2500);
        bagDto1.setBrand("adidas");
        bagDto1.setCapacityInKg(5);

        Boolean result=bagDto.equals(bagDto1);

        if (result==true){
            System.out.println("both are same category bag");
        }else {
            System.out.println("both are different category");
        }
    }
}
