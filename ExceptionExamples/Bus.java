package com.xworks.ExceptionExamples;

public class Bus implements AutoCloseable{


    public void open(){
        System.out.println("open");
    }
    public void use(){
        System.out.println("use");
    }
    public void close()  {
        System.out.println("close");
    }
}
