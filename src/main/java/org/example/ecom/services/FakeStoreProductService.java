package org.example.ecom.services;

import org.example.ecom.dto.FakeStoreProductResponse;
import org.example.ecom.gateway.IProductGateway;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class FakeStoreProductService implements IProductService{

    private final IProductGateway productGateway;
    public FakeStoreProductService(@Qualifier("fakeStoreRestTemplateGateway") IProductGateway productGateway) {
        this.productGateway = productGateway;
    }

    @Override
    public FakeStoreProductResponse getProductById(Long id)  throws IOException {
        return productGateway.getProductById(id) ;
    }
}
