package com.xworks.collection.Runner;

import com.xworks.collection.dto.collegeDto;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Locale;

public class collegeRunner {

    public static void main(String[] args) {
        Collection<collegeDto> collection = new ArrayList<>();
        collection.add(new collegeDto("Bharath matha"));
        collection.add(new collegeDto("Harvard University"));
        collection.add(new collegeDto("Stanford University"));
        collection.add(new collegeDto("Massachusetts Institute of Technology (MIT)"));
        collection.add(new collegeDto("California Institute of Technology (Caltech)"));
        collection.add(new collegeDto("University of Oxford"));
        collection.add(new collegeDto("University of Cambridge"));
        collection.add(new collegeDto("Princeton University"));
        collection.add(new collegeDto("University of Chicago"));
        collection.add(new collegeDto("Columbia University"));
        collection.add(new collegeDto("Yale University"));
        collection.add(new collegeDto("University of California, Berkeley"));
        collection.add(new collegeDto("University of California, Los Angeles (UCLA)"));
        collection.add(new collegeDto("University of Pennsylvania"));
        collection.add(new collegeDto("University of Michigan"));
        collection.add(new collegeDto("Cornell University"));
        collection.add(new collegeDto("Duke University"));
        collection.add(new collegeDto("Northwestern University"));
        collection.add(new collegeDto("University of Toronto"));
        collection.add(new collegeDto("AImperial College London"));
        collection.add(new collegeDto("Johns Hopkins University"));
        System.out.println("----------college name starts with 'a'---------------------");
        collection.stream().filter(a->a.getCollegeName().startsWith("A")).forEach(a-> System.out.println(a.getCollegeName()));
        System.out.println("----------------------------lower case-------------------------");
        collection.stream().map(a->a.getCollegeName().toLowerCase()).forEach(a-> System.out.println(a));
        System.out.println("---------------------------upper case--------------------------");
        collection.stream().map(a-> a.getCollegeName().toUpperCase()).forEach(a-> System.out.println(a));
        System.out.println("----------------descending order---------------------------------------------");
        collection.stream() .sorted((a, b) -> b.getCollegeName().compareTo(a.getCollegeName())) .forEach(a-> System.out.println(a.getCollegeName()));
    }
}
