package com.xworks.collection.Runner;

import com.xworks.collection.dto.GiftDto;

import java.util.*;

public class GiftRunner {
    public static void main(String[] args) {
        GiftDto gift1 = new GiftDto(1, "Smartphone", 699.99, "John", "Alice");
        GiftDto gift2 = new GiftDto(2, "Laptop", 1299.50, "Mary", "Bob");
        GiftDto gift3 = new GiftDto(3, "Watch", 199.99, "David", "Sara");
        GiftDto gift4 = new GiftDto(4, "Book", 29.95, "Paul", "Linda");
        GiftDto gift5 = new GiftDto(5, "Headphones", 149.00, "Jane", "Mike");
        GiftDto gift6 = new GiftDto(6, "Backpack", 59.99, "Mark", "Emma");
        GiftDto gift7 = new GiftDto(1, "Smartphone", 699.99, "John", "Alice");
        GiftDto gift8 = new GiftDto(7, "Camera", 499.99, "Luke", "Rachel");
        GiftDto gift9 = new GiftDto(8, "Smart Speaker", 99.99, "Sophia", "Jake");
        GiftDto gift10 = new GiftDto(1, "Smartphone", 699.99, "John", "Alice");

        Set<GiftDto> list=new LinkedHashSet<>();
        list.add(gift1);
        list.add(gift2);
        list.add(gift3);
        list.add(gift4);
        list.add(gift5);
        list.add(gift6);
        list.add(gift7);
        list.add(gift8);
        list.add(gift9);
        list.add(gift10);

        list.stream().sorted(Comparator.comparingDouble(GiftDto::getCost)).forEach(System.out::println);
        System.out.println("-----------------------------------------");
        list.stream().sorted(Comparator.comparing(GiftDto::getName) .thenComparing(GiftDto::getFrom)).forEach(System.out::println);
        System.out.println("--------------------------------------------------------------------");
        list.stream().map(GiftDto::getId).forEach(System.out::println);
        System.out.println("--------------------------------------------");
        list.stream().map(GiftDto::getFrom).sorted(Comparator.reverseOrder()).forEach(System.out::println);







    }
}
