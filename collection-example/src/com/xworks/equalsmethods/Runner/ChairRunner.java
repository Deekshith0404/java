package com.xworks.equalsmethods.Runner;

import com.xworks.equalsmethods.example.ChairDto;

public class ChairRunner {
    public static void main(String[] args) {
        ChairDto chairDto=new ChairDto(500,"tata",5,3);
        ChairDto chairDto1=new ChairDto(500,"birla",5,7);
         boolean result=chairDto.equals(chairDto1);

         if (result==true){
             System.out.println("same quality chairs");
         }else {
             System.out.println("different quality chairs");
         }
    }
}
