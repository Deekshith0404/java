package com.xworks.colllexamp.examp.runner;

import com.xworks.colllexamp.examp.CreditCardDto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CreditCardRunner {
    public static void main(String[] args) {
        CreditCardDto creditCardDto = new CreditCardDto();
        Collection<CreditCardDto> collection = new ArrayList<>();
        collection.add(new CreditCardDto("visa", 568974568952l, 012, LocalDate.of(2026,11,25)));
        collection.add(new CreditCardDto("visa", 568974568952L, 012,LocalDate.of(2025,1,10)));
        collection.add(new CreditCardDto("mastercard", 451235781234L, 045,LocalDate.of(2027,1,12)));
        collection.add(new CreditCardDto("visa", 378282246310L, 987,LocalDate.of(2026,12,11)));
        collection.add(new CreditCardDto("rupay", 601111111111L, 321,LocalDate.of(2025,1,20)));
        collection.add(new CreditCardDto("mastercard", 353011133330L, 654,LocalDate.of(2027,8,9)));
        collection.add(new CreditCardDto("rupay", 305693090259L, 789,LocalDate.of(2026,1,10)));
        collection.add(new CreditCardDto("visa", 676283000000L, 101,LocalDate.of(2022,1,10)));
        collection.add(new CreditCardDto("mastercard", 622126000000L, 202,LocalDate.of(2026,1,10)));
        collection.add(new CreditCardDto("rupay", 652123456789L, 303,LocalDate.of(2028,1,10)));
        collection.add(new CreditCardDto("visa", 400012345678L, 404,LocalDate.of(2023,1,10)));
        collection.add(new CreditCardDto("mastercard", 510510510510L,123,LocalDate.of(2021,1,10)));

        Iterator<CreditCardDto> iterator1=collection.iterator();
        while (iterator1.hasNext()){
            CreditCardDto val=iterator1.next();
            if (val.getCvv()>500){
                System.out.println("removing the cards whoese cvv are greater than 500 :"+val.getType());
            }
        }
        System.out.println("=============================================================================");


        Iterator<CreditCardDto> iterator= collection.iterator();
        while (iterator.hasNext()){
            CreditCardDto val=iterator.next();
            if (val.getExpireDate().getYear()<2027){
                System.out.println("removing the card that expires before 2027 : "+val.getType());
                iterator.remove();
            }
        }
        System.out.println(collection.size());
    }
}
