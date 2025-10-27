package org.example.ecom.services;

import org.example.ecom.dto.FakeStoreProductResponse;
import org.example.ecom.dto.ProductDTO;

import java.io.IOException;

public interface IProductService {

    public ProductDTO getProductById(Long id) throws IOException;
}
