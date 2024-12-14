package com.xworks.ecommerce.appliactin;

import com.xworks.ecommerce.dto.ProductDto;

import java.util.Arrays;

public class application {
    ProductDto productDto[]=new ProductDto[3];
    int index;

    public String saveDto(ProductDto dto){
        this.productDto=productDto;
        if (productDto!=null){
            productDto[index]=dto;
            index++;
            return "data is saved";
        }
    return "data not saved";
    }
    public  void read(){
        for (ProductDto dto:productDto) {
            System.out.println(dto);
        }
    }
    public String delete(int id){
        int i,j;
        String delete="not deleted";
        for (i = 0,j=0; i < productDto.length ; i++) {
            if (productDto[i].getId()!=id){
                this.productDto[j++]=productDto[i];
                delete="deleted";
            }
        }

        productDto=Arrays.copyOf(productDto,j);
        deleteAfter(productDto);
        return delete;
    }

    public void deleteAfter(ProductDto[] delete){
        for (ProductDto dele:delete){
            System.out.println(dele);
        }
    }

    public void update(int id,String name){
        for (int i = 0; i < productDto.length ; i++) {
            if(productDto[i].getId()==id){
                productDto[i].setName(name);
            }

        }
    }

}
