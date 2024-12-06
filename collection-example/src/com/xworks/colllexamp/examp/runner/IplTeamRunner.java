package com.xworks.colllexamp.examp.runner;

import com.xworks.colllexamp.examp.IplTeamDto;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IplTeamRunner {
    public static void main(String[] args) {
        IplTeamDto iplTeamDto=new IplTeamDto("Rcb",23,"United Sperits","Qatar airways",83);
        IplTeamDto iplTeamDto1=new IplTeamDto("mi",22,"Reliance Industries","JIO",45);
        IplTeamDto iplTeamDto2=new IplTeamDto("csk",19,"N.Srinivasan","Etihad Airways",55);
        IplTeamDto iplTeamDto3=new IplTeamDto("RR",24,"Emerging media","TAT",41);
        IplTeamDto iplTeamDto4=new IplTeamDto("KKR",25,"sharuk khan","ceat",51);
        IplTeamDto iplTeamDto5=new IplTeamDto("PBKS",21,"Mohith burman","dream11",110);
        IplTeamDto iplTeamDto6=new IplTeamDto("SRH",20,"Kalanithi maran","dream11",45);
        IplTeamDto iplTeamDto7=new IplTeamDto("GT",20,"CVC Capital Partners","Phonepay",69);
        IplTeamDto iplTeamDto8=new IplTeamDto("DC",19,"GMR Group","paytm",73);
        IplTeamDto iplTeamDto9=new IplTeamDto("LSG",22,"RPSG Group","muthoot",69);


        Collection<IplTeamDto> collection=new ArrayList<>();

        collection.add(iplTeamDto);
        collection.add(iplTeamDto1);
        collection.add(iplTeamDto2);
        collection.add(iplTeamDto3);
        collection.add(iplTeamDto4);
        collection.add(iplTeamDto5);
        collection.add(iplTeamDto6);
        collection.add(iplTeamDto7);
        collection.add(iplTeamDto8);
        collection.add(iplTeamDto9);


        Iterator<IplTeamDto> iterator= collection.iterator();
        while (iterator.hasNext()){
            IplTeamDto value=iterator.next();
            if (value.getSponser().equals("JIO")){
                System.out.println("removed by sponser name jio : "+value.getTeamName());
                iterator.remove();
            }
        }
        System.out.println("-------------------------------------------------------");
        Iterator<IplTeamDto> iterator1= collection.iterator();
        while (iterator1.hasNext()){
            IplTeamDto val=iterator1.next();
            if (val.getNumberOfPlayers()<20){
                System.out.println("removed team below 20 players :"+val.getTeamName());
                iterator1.remove();
            }
        }
        System.out.println("-------------------------------------------------------");
        Iterator<IplTeamDto> iterator2= collection.iterator();
        while (iterator2.hasNext()){
            IplTeamDto val=iterator2.next();
            if (val.getBudget()>50){
                System.out.println("removed team with budget more than 50:"+val.getTeamName());
                iterator2.remove();
            }
        }



    }
}

