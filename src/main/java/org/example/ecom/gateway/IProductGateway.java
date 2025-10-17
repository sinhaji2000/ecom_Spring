package org.example.ecom.gateway;

import org.example.ecom.dto.FakeStoreProductResponse;

import java.io.IOException;

public interface IProductGateway {

    FakeStoreProductResponse getProductById(Long id) throws IOException;
}
