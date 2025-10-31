package org.example.ecom.mapper;

import org.example.ecom.dto.FakeStoreProductResponse;
import org.example.ecom.dto.ProductDTO;
import org.example.ecom.entity.Category;
import org.example.ecom.entity.Product;

public class ProductMapper {

    public static ProductDTO toProductDTO(FakeStoreProductResponse response) {

        ProductDTO dto = new ProductDTO();
        dto.setId(response.getId());
        dto.setName(response.getTitle());
        dto.setDescription(response.getDescription());



        // Convert Object to double safely
        if (response.getPrice() instanceof Number) {
            dto.setPrice(((Number) response.getPrice()).doubleValue());
        } else {
            dto.setPrice(Double.parseDouble(response.getPrice().toString()));
        }

        return dto;

    }

    public static ProductDTO toProductDTO(Product product) {
        if (product == null) return null;

        ProductDTO dto = new ProductDTO();
        //dto.setId((int) product.getId());
        dto.setName(product.getName());
        dto.setColor(product.getColor());
        dto.setPrice(product.getPrice());
        dto.setDescription(product.getDescription());
        dto.setModel(product.getModel());
        dto.setTitle(product.getTitle());
        dto.setCategoryId(product.getCategory().getId());
        dto.setBrand(product.getBrand());



        return dto;
    }

    public static Product toEntity(ProductDTO dto,  Category category) {
        if (dto == null) return null;
        //Category category = new Category();
        category.setId(dto.getCategoryId());
        return Product.builder()
                .name(dto.getName())
                .color(dto.getColor())
                .price((int) dto.getPrice())
                .description(dto.getDescription())
                .discount(0)
                .model(dto.getModel())
                .title(dto.getName())
                .category(category)
                .brand(dto.getBrand())
                .isPopular(false)
                .build();
    }


//    private String name;
//    private String color;
//    private int price;
//    private String description;
//    private int discount;
//    private String model;
//    private String title;
//    private String category;
//    private String brand;
//    private boolean isPopular;
}
