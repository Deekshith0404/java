package com.xworks.ecommerce.dto;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@ToString
@NoArgsConstructor

public class ProductDto {
    private int id;
    private String name;
    private double price;
    private int quantity;
    private float ratings;

}
