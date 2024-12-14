package com.xworks.collection.Runner;

import com.xworks.collection.dto.cricketDto;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.stream.Collectors;

public class cricketRunner {
    public static void main(String[] args) {
        cricketDto iplTeamDto = new cricketDto("Rcb", 23, "United Spirits", "Qatar Airways", 83);
        cricketDto iplTeamDto1 = new cricketDto("MI", 22, "Reliance Industries", "JIO", 45);
        cricketDto iplTeamDto2 = new cricketDto("CSK", 23, "N. Srinivasan", "Etihad Airways", 55);
        cricketDto iplTeamDto3 = new cricketDto("RR", 24, "Emerging Media", "TAT", 41);
        cricketDto iplTeamDto4 = new cricketDto("KKR", 25, "Shah Rukh Khan", "CEAT", 51);
        cricketDto iplTeamDto5 = new cricketDto("PBKS", 21, "Mohith Burman", "Dream11", 110);
        cricketDto iplTeamDto6 = new cricketDto("SRH", 20, "Kalanithi Maran", "Dream11", 45);
        cricketDto iplTeamDto7 = new cricketDto("GT", 20, "CVC Capital Partners", "PhonePe", 69);
        cricketDto iplTeamDto8 = new cricketDto("DC", 19, "GMR Group", "Paytm", 73);
        cricketDto iplTeamDto9 = new cricketDto("LSG", 22, "RPSG Group", "Muthoot", 69);

        Collection<cricketDto> collection = new ArrayList<>();

        // 1. add
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

        // 2. addAll
        Collection<cricketDto> anotherCollection = new ArrayList<>();
        anotherCollection.add(iplTeamDto9);
        collection.addAll(anotherCollection);

        // 3. clear
        anotherCollection.clear();

        // 4. contains
        boolean contains = collection.contains(iplTeamDto1);
        System.out.println("Contains MI: " + contains);

        // 5. containsAll
        boolean containsAll = collection.containsAll(anotherCollection);
        System.out.println("Contains all from anotherCollection: " + containsAll);

        // 6. equals
        boolean isEqual = collection.equals(anotherCollection);
        System.out.println("Collections are equal: " + isEqual);

        // 7. hashCode
        int hashCode = collection.hashCode();
        System.out.println("Collection hash code: " + hashCode);

        // 8. isEmpty
        boolean isEmpty = collection.isEmpty();
        System.out.println("Collection is empty: " + isEmpty);

        // 9. iterator
        Iterator<cricketDto> iterator = collection.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // 10. remove
        collection.remove(iplTeamDto9);
        System.out.println("After removing LSG: " + collection);

        // 11. removeAll
        Collection<cricketDto> teamsToRemove = new ArrayList<>();
        teamsToRemove.add(iplTeamDto8);
        teamsToRemove.add(iplTeamDto7);
        collection.removeAll(teamsToRemove);
        System.out.println("After removing some teams: " + collection);

        // 12. retainAll
        Collection<cricketDto> teamsToRetain = new ArrayList<>();
        teamsToRetain.add(iplTeamDto2);
        teamsToRetain.add(iplTeamDto3);
        collection.retainAll(teamsToRetain);
        System.out.println("After retaining some teams: " + collection);

        // 13. size
        int size = collection.size();
        System.out.println("Collection size: " + size);

        // 14. toArray
        Object[] array = collection.toArray();
        System.out.println("Array: " + java.util.Arrays.toString(array));

        // 15. toArray(T[] a)
        cricketDto[] cricketArray = collection.toArray(new cricketDto[0]);
        System.out.println("Typed Array: " + java.util.Arrays.toString(cricketArray));

        // 16. stream (Java 8+)
        collection.stream()
                .map(cricketDto::getTeamName)
                .forEach(System.out::println);

        // 17. parallelStream (Java 8+)
        collection.parallelStream()
                .map(cricketDto::getTeamName)
                .forEach(System.out::println);

        // 18. forEach (Java 8+)
        collection.forEach(team -> System.out.println("Team: " + team));

        // 19. spliterator (Java 8+)
        java.util.Spliterator<cricketDto> spliterator = collection.spliterator();
        spliterator.forEachRemaining(System.out::println);
    }
}

