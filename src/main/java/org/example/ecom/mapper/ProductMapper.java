package org.example.ecom.mapper;

import org.example.ecom.dto.FakeStoreProductResponse;
import org.example.ecom.dto.ProductDTO;
import org.example.ecom.dto.ProductWithCateoryDTO;
import org.example.ecom.entity.Category;
import org.example.ecom.entity.Product;

public class ProductMapper {

    public static ProductDTO toProductDTO(FakeStoreProductResponse response) {

        ProductDTO dto = new ProductDTO();
//        dto.setId(response.getId());
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
        dto.setCategoryId(product.getId());
        dto.setId(product.getId());
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

    public static ProductWithCateoryDTO toProductWithCateoryDTO(Product product) {

       // if(product == null) return null;

        return ProductWithCateoryDTO.builder()
                .name(product.getName())
                .color(product.getColor())
                .price(product.getPrice())
                .description(product.getDescription())
                .model(product.getModel())
                .title(product.getTitle())
                .brand(product.getBrand())
                .category(CategoryMapper.toCategoryDTO(product.getCategory()))
                .build() ;


    }

}
