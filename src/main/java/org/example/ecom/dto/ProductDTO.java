package org.example.ecom.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class ProductDTO {
    private Long id;
    private String name;
    private String color ;
    private double price;
    private String description;
    private String model ;
    private String title ;
    private Long categoryId;
    private String brand;


}
