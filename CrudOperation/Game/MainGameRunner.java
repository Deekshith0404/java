package com.xworks.CrudOperation.Game;

public class MainGameRunner {
    public static void main(String[] args) {
        MainGame mainGame1=new MainGame();
        mainGame1.setGameSize(50);
        mainGame1.setType("xml");
        mainGame1.setAccontCreatedDate(31);
        mainGame1.setActive(true);


        MainGame mainGame2=new MainGame();
        mainGame2.setGameSize(10);
        mainGame2.setType("html");
        mainGame2.setAccontCreatedDate(15);
        mainGame2.setActive(false);


        MainGame mainGame3=new MainGame();
        mainGame3.setGameSize(15);
        mainGame3.setType("js");
        mainGame3.setAccontCreatedDate(01);
        mainGame3.setActive(false);

        MainGame mainGame4 =new MainGame();
        mainGame4.setGameSize(60);
        mainGame4.setType("htp");
        mainGame4.setAccontCreatedDate(23);
        mainGame4.setActive(true);

        AdditionalFile additionalFile=new AdditionalFile();
        String detail=additionalFile.saveDetails(mainGame1);
        System.out.println(detail);

        String detail1=additionalFile.saveDetails(mainGame2);
        System.out.println(detail1);

        String detail2=additionalFile.saveDetails(mainGame3);
        System.out.println(detail2);

        String detail3=additionalFile.saveDetails(mainGame4);
        System.out.println(detail3);

        additionalFile.read();
        System.out.println("-----------------------------");
        additionalFile.checkIsActive();
        System.out.println("---------------------------");
        additionalFile.searchByType("xml");
        System.out.println("--------------------------");
        additionalFile.checkSize();


    }
}
