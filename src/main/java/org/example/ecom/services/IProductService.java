package org.example.ecom.services;

import org.example.ecom.dto.FakeStoreProductResponse;
import org.example.ecom.dto.ProductDTO;
import org.example.ecom.dto.ProductWithCateoryDTO;

import java.io.IOException;

public interface IProductService {

    public ProductDTO getProductById(Long id) throws IOException;
    public ProductDTO createProduct (ProductDTO productDTO) throws IOException;
    public ProductWithCateoryDTO getProductWithCategory(Long id) throws IOException;
}
