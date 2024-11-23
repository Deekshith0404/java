package com.xworks.ExceptionExamples;

public class BusRunner {
    public static void main(String[] args)  {
        Bus bus =new Bus();
        try {
            bus.open();
            bus.use();
        }
        catch (ArithmeticException e){
            System.err.println("error here"+e.getMessage());
        }
        finally {
            bus.close();
        }
    }
}
