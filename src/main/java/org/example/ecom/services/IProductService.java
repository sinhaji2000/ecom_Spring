package org.example.ecom.services;

import org.example.ecom.dto.FakeStoreProductResponse;

import java.io.IOException;

public interface IProductService {

    public FakeStoreProductResponse getProductById(Long id) throws IOException;
}
