package com.xworks.ecommerce;

import com.xworks.ecommerce.appliactin.application;
import com.xworks.ecommerce.dto.ProductDto;

public class DtoRunner {
    public static void main(String[] args) {
        ProductDto productDto=new ProductDto();
        productDto.setId(1);
        productDto.setName("Mtr");
        productDto.setPrice(500.10);
        productDto.setQuantity(10);
        productDto.setRatings(5.3f);

        ProductDto productDto1=new ProductDto();
        productDto1.setId(2);
        productDto1.setName("grb");
        productDto1.setPrice(250.56);
        productDto1.setQuantity(7);
        productDto1.setRatings(4.9f);

        ProductDto productDto2=new ProductDto();
        productDto2.setId(3);
        productDto2.setName("haldi");
        productDto2.setPrice(175.56);
        productDto2.setQuantity(25);
        productDto2.setRatings(7.5f);

        application app=new application();
        String result=app.saveDto(productDto);
        System.out.println(result);
        String result1=app.saveDto(productDto1);
        System.out.println(result1);
        String result2=app.saveDto(productDto2);
        System.out.println(result2);


        app.update(1,"raju");

        String res=app.delete(2);
        System.out.println(res);


        app.read();


    }
}
