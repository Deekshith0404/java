package com.xworks.equalsmethods.Runner;

import com.xworks.equalsmethods.example.Pen;

public class PenRunner {
    public static void main(String[] args) {
        Pen pen = new Pen();
        pen.setBrand("renolt");
        pen.setColor("red");
        pen.setLength(5);
        pen.setPrice(10);

        Pen pen1 = new Pen();
        pen1.setColor("black");
        pen1.setPrice(10);
        pen1.setBrand("renolt");
        pen1.setLength(3);

        boolean result = pen.equals(pen1);
        if (result == true) {
            System.out.println("both are same");
        }else {
            System.out.println("both are different");
        }
    }
}

