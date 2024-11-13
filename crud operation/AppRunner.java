package dto;

import application.Application;

public class AppRunner {
    public static void main(String[] args) {
        Application application1=new Application();
        application1.setModelNum(1);
        application1.setVersionNum("2.01");
        application1.setPrice(25000);
        application1.setMobileName("mi");
        application1.setManufactureYear(2021);


        Application application2=new Application();
        application2.setModelNum(52);
        application2.setVersionNum("4.01");
        application2.setPrice(15000);
        application2.setMobileName("realme");
        application2.setManufactureYear(2005);


        Application application3=new Application();
        application3.setModelNum(21);
        application3.setVersionNum("0.1");
        application3.setPrice(50000);
        application3.setMobileName("iqoo");
        application3.setManufactureYear(2000);

        Application application4=new Application();
        application4.setModelNum(00);
        application4.setVersionNum("5.2");
        application4.setPrice(5000);
        application4.setMobileName("oppo");
        application4.setManufactureYear(2010);

        Application application5=new Application();
        application5.setModelNum(55);
        application5.setVersionNum("7.2");
        application5.setPrice(15000);
        application5.setMobileName("samsung");
        application5.setManufactureYear(2011);

        App app=new App();
    String result=app.saveDetail(application1);
    System.out.println(result);

    String result2=app.saveDetail(application2);
    System.out.println(result2);

        String result3=app.saveDetail(application3);
        System.out.println(result3);

        String result4=app.saveDetail(application4);
        System.out.println(result4);

        String result5=app.saveDetail(application5);
        System.out.println(result5);

        app.read();
        System.out.println("==================================");

        app.findAppDetailByModelNum(55);
        System.out.println("====================");
        app.findAppUsingName("mi");
    }
}

