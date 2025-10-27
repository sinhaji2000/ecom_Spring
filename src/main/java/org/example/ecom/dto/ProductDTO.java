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
    private int id;
    private String name;
    private String description;
    private double price;
    private String category;
    private String imageUrl;
}
