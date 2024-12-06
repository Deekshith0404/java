package com.xworks.collection.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

public class CreditCardDto implements Serializable {
   private String type;
   private long number;
   //private LocalDate expireDate=LocalDate.now();
   private LocalDate expireDate;
   private int cvv;

    public CreditCardDto(){

    }
    public CreditCardDto(String type, long number, int cvv,LocalDate expireDate) {
        this.type = type;
        this.number = number;
        this.cvv = cvv;
        this.expireDate=expireDate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public LocalDate getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(LocalDate expireDate) {
        this.expireDate = expireDate;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    @Override
    public String toString() {
        return "CreditCardDto{" +
                "type='" + type + '\'' +
                ", number=" + number +
                ", expireDate=" + expireDate +
                ", cvv=" + cvv +
                '}';
    }
}

//CreditCardDTO(10) : type,no,expiryDate:LocalDate,cvv
//find all creditCardDTO where expiryDate > 2026
//find all creditCardDTO by type(visa,rupay,master)
//print all cvv
//print all no
