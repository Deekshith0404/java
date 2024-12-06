package com.xworks.collection.Runner;

import com.xworks.collection.dto.AddressDto;
import com.xworks.collection.dto.PersonDto;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class PersonRunner {
    public static void main(String[] args) {
        AddressDto addressDto1 = new AddressDto("kalasipalya",21,"rajajinagar");
        AddressDto addressDto2 = new AddressDto("MG Road", 101, "Brigade Road");
        AddressDto addressDto3 = new AddressDto("Whitefield", 205, "Marathahalli");
        AddressDto addressDto4 = new AddressDto("Indiranagar", 305, "Koramangala");
        AddressDto addressDto5 = new AddressDto("BTM Layout", 407, "HSR Layout");
        AddressDto addressDto6 = new AddressDto("Electronic City", 511, "Sarjapur Road");
        AddressDto addressDto7 = new AddressDto("Jayanagar", 601, "Banashankari");
        AddressDto addressDto8 = new AddressDto("Basavanagudi", 720, "Gandhi Bazaar");
        AddressDto addressDto9 = new AddressDto("Malleswaram", 805, "Yeshwanthpur");
        AddressDto addressDto10 = new AddressDto("Hebbal", 905, "RT Nagar");
        AddressDto addressDto11 = new AddressDto("Bommanahalli", 102, "Begur Road");
        AddressDto addressDto12 = new AddressDto("Domlur", 213, "Old Airport Road");

        PersonDto personn = new PersonDto();
        Collection<PersonDto> collection = new ArrayList<>();
        collection.add(new PersonDto("soma","soma123@gmail.com",2563429852l,"bangalore",addressDto1));
        collection.add(new PersonDto("Ravi", "ravi123@gmail.com", 9876543210L, "Chennai", addressDto2));
        collection.add(new PersonDto("Priya", "priya456@gmail.com", 8765432109L, "Mumbai", addressDto3));
        collection.add(new PersonDto("Arun", "arun789@gmail.com", 7654321098L, "Delhi", addressDto4));
        collection.add(new PersonDto("Meera", "meera101@gmail.com", 6543210987L, "Hyderabad", addressDto5));
        collection.add(new PersonDto("Raj", "raj202@gmail.com", 5432109876L, "Pune", addressDto6));
        collection.add(new PersonDto("Anita", "anita303@gmail.com", 4321098765L, "Kolkata", addressDto7));
        collection.add(new PersonDto("Kiran", "kiran404@gmail.com", 3210987654L, "Ahmedabad", addressDto8));
        collection.add(new PersonDto("Deepa", "deepa505@gmail.com", 2109876543L, "Jaipur", addressDto9));
        collection.add(new PersonDto("Vijay", "vijay606@gmail.com", 1098765432L, "Lucknow", addressDto10));
        collection.add(new PersonDto("Renu", "renu707@gmail.com", 1987654321L, "Chandigarh", addressDto11));
        collection.add(new PersonDto("Neha", "neha808@gmail.com", 1122334455L, "Bhopal", addressDto12));

        System.out.println("--------------------name starts with 'a'----------------------------------------------------");
        collection.stream().filter(a->a.getName().startsWith("A")).forEach(a-> System.out.println(a));
        System.out.println("---------------------area 'rt nagar'-----------------------------------------------------");
        collection.stream().filter(a->a.getAddressDto().getArea().equals("RT Nagar")).forEach(a-> System.out.println(a));
        System.out.println("------------------------------compared area and returned only address----------------------------------------");
        collection.stream().sorted((a,b)->a.getAddressDto().getArea().compareTo(b.getAddressDto().getArea())).forEach(a-> System.out.println(a.getAddressDto()));
        System.out.println("-----------------------------compare area ------------------------------------------------");
        collection.stream().sorted((a,b)->a.getAddressDto().getArea().compareTo(b.getAddressDto().getArea())).forEach(a-> System.out.println(a));
        System.out.println("---------------------------------streed white field---------------------------------------------------");
        collection.stream().filter(a->a.getAddressDto().getStreet().equals("Whitefield")).forEach(a-> System.out.println(a));
        System.out.println("-------------------------------------------------------------------------------------------------------------");
        collection.stream().filter(a->a.getEmail().equals("anita303@gmail.com") || a.getAddressDto().getStreet().equals("Jayanagar") || a.getAddressDto().getArea().equals("Koramangala")).forEach(a-> System.out.println(a));
        System.out.println("---------------------------------------------------------------------------------------------------------------");
        collection.stream().sorted((a,b)->a.getName().compareTo(b.getName())).forEach(a-> System.out.println(a));
        System.out.println("----------------------------------------------------------------------------------------------------------------");
        List<String> list=collection.stream().map(a->a.getAddressDto().getArea()).collect(Collectors.toList());
        list.forEach(a-> System.out.println(a));
        System.out.println("------------------------------------------------------------------------------------------------------");
        List<String> list1=collection.stream().map(a->a.getAddressDto().getStreet()).collect(Collectors.toList());
        list1.forEach(a-> System.out.println(a));
    }
}



