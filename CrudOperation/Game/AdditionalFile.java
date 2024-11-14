package com.xworks.CrudOperation.Game;

public class AdditionalFile {
    MainGame mainGame[]=new MainGame[4];
    int index;

    public String saveDetails(MainGame main){
        if (mainGame!=null){
            mainGame[index]=main;
            index++;
        }
        return "data saved";
    }
    public  void read(){
        for (int i = 0; i < mainGame.length ; i++) {
            System.out.println(mainGame[i]);
        }
    }



    public void checkSize(){
        for (int i = 0; i < mainGame.length; i++) {
            if (mainGame[i].getGameSize()>20){
                System.out.println("this is big game \n");
                System.out.println(mainGame[i]);
            }
            else System.out.println("these is small game \n"+mainGame[i]);
        }
    }

    public void searchByType(String fileType){
        for (int i = 0; i < mainGame.length; i++) {
            if (mainGame[i].getType().equals(fileType)){
                System.out.println(mainGame[i]);
            }
        }
    }

    public void checkIsActive(){
        for (int i = 0; i < mainGame.length; i++) {
            if (mainGame[i].isActive()==false){
                System.out.println("the player is no more active");
                System.out.println(mainGame[i]);
            }
            else {
                System.out.println("the player is active");
                System.out.println(mainGame[i]);
            }
        }
    }

}
