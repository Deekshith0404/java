package com.xworkz.abstRunner;

import com.xworkz.abst.GlueWeb;

public class WebRunner {
    public static void main(String[] args) {
        GlueWeb glueWeb=new GlueWeb();
        glueWeb.version(15);
        System.out.println(glueWeb);
    }
}
