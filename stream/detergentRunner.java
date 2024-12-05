package com.xworks.collection.Runner;

import com.xworks.collection.dto.DetergentDto;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class detergentRunner {
    public static void main(String[] args) {
        DetergentDto detergentDto = new DetergentDto();
        Collection<DetergentDto> collection = new ArrayList<>();
        collection.add(new DetergentDto(60, "Ariel", 10, 2, "Ariel"));
        collection.add(new DetergentDto(40, "Surf Excel", 15, 3, "Surf Excel"));
        collection.add(new DetergentDto(55, "Persil", 50, 4, "Persil"));
        collection.add(new DetergentDto(65, "Gain", 4, 5, "Gain"));
        collection.add(new DetergentDto(50, "OMO", 1, 3, "OMO"));
        collection.add(new DetergentDto(45, "Arm & Hammer", 6, 5, "Arm & Hammer"));
        collection.add(new DetergentDto(70, "Purex", 7, 5, "Purex"));
        collection.add(new DetergentDto(35, "Sunlight", 9, 3, "Sunlight"));
        collection.add(new DetergentDto(60, "Wisk", 3, 4, "Wisk"));
        collection.add(new DetergentDto(55, "Foca", 8, 4, "Foca"));


        collection.stream().filter(d->d.getPricePerKg()<100).forEach(d-> System.out.println(d));
        System.out.println("------------------------------------------------");
        collection.stream().filter(d->d.getQuantity()<5).forEach(d-> System.out.println(d));
        System.out.println("-------------------------------------------------");
        collection.stream().filter(d->d.getDiscount()<=3 && d.getBrand().equals("Ariel")).forEach(d-> System.out.println(d));
        System.out.println("------------------------------------------------------------");
        collection.stream() .sorted((d1, d2) -> Integer.compare(d2.getPricePerKg(),d1.getPricePerKg())).forEach(d-> System.out.println(d));
        System.out.println("---------------------------------------------------------------");
        collection.stream().filter(d->d.getSoldBy().equals("Surf Excel") || d.getBrand().equals("Surf Excel") || d.getQuantity()<15).forEach(d-> System.out.println(d));
    }

}
