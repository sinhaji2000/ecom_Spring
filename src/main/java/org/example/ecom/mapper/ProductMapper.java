package org.example.ecom.mapper;

import org.example.ecom.dto.FakeStoreProductResponse;
import org.example.ecom.dto.ProductDTO;
import org.example.ecom.entity.Product;

public class ProductMapper {

    public static ProductDTO toProductDTO(FakeStoreProductResponse response) {

        ProductDTO dto = new ProductDTO();
        dto.setId(response.getId());
        dto.setName(response.getTitle());
        dto.setDescription(response.getDescription());
        dto.setCategory(response.getCategory());
        dto.setImageUrl(response.getImage());

        // Convert Object to double safely
        if (response.getPrice() instanceof Number) {
            dto.setPrice(((Number) response.getPrice()).doubleValue());
        } else {
            dto.setPrice(Double.parseDouble(response.getPrice().toString()));
        }

        return dto;

    }
}
