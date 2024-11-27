package com.xworks.collection.Runner;

import com.xworks.collection.dto.IplTeamDto;

import java.util.ArrayList;
import java.util.Collection;

public class IplTeamRunner {
    public static void main(String[] args) {
        IplTeamDto iplTeamDto=new IplTeamDto("Rcb",23,"United Sperits","Qatar airways",83);
        IplTeamDto iplTeamDto1=new IplTeamDto("mi",22,"Reliance Industries","JIO",45);
        IplTeamDto iplTeamDto2=new IplTeamDto("csk",23,"N.Srinivasan","Etihad Airways",55);
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


        for (IplTeamDto dto:collection){
            System.out.printf("TeamName :"+dto.getTeamName()+"\n");
        }
        System.out.println("---------------------------------------------------");
        for (IplTeamDto dto:collection){
            if (dto.getBudget()>60){
                System.out.println(dto);
            }
        }
        System.out.println("---------------------------------------------------");
        for (IplTeamDto dto:collection){
            if (dto.getSponser().equals("dream11")){
                System.out.println("team that are sponsered by dream11 \n"+dto);
            }
        }
        System.out.println("---------------------------------------------------");
        for (IplTeamDto dto:collection) {
            if (dto.getNumberOfPlayers() >=23) {
                System.out.println("team with more than 23 players :\n"+dto);
            }

        }
        System.out.println("---------------------------------------------------");
        for (IplTeamDto dto:collection){
            if (dto.getOwnerName().equals("United Sperits") && dto.getSponser().equals("Qatar airways")){
                System.out.println("team by owner name and sponser \n"+dto);
            }
        }

        System.out.println("-------------------------------------------------------------");
        for(IplTeamDto dto:collection){
            System.out.println("TeamName:"+dto.getTeamName()+"\tNumber OF Players:"+dto.getNumberOfPlayers());
        }
        System.out.println("-------------------------------------------------------------");
        for (IplTeamDto dto:collection){
            System.out.println("Team name:"+dto.getTeamName()+"\tBudget "+dto.getBudget());
        }


    }
}

