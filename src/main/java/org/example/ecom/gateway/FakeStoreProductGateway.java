package org.example.ecom.gateway;

import org.example.ecom.dto.FakeStoreProductResponse;
import org.example.ecom.gateway.api.FakeStoreProductApi;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class FakeStoreProductGateway implements IProductGateway{

    private final FakeStoreProductApi fakeStoreProductApi;
    public FakeStoreProductGateway(FakeStoreProductApi fakeStoreProductApi) {
        this.fakeStoreProductApi = fakeStoreProductApi;
    }

    @Override
    public FakeStoreProductResponse getProductById(Long id) throws IOException {
        FakeStoreProductResponse product = fakeStoreProductApi.getProductById(id)
                .execute()
                .body() ;

        return product;
    }
}
