package org.example.ecom.dto;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductWithCateoryDTO {
    private int id;
    private String name;
    private String color ;
    private double price;
    private String description;
    private String model ;
    private String title ;
    private String brand;
    private CategoryDTO category;
}
