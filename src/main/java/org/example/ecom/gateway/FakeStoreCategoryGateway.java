package org.example.ecom.gateway;

import java.io.IOException;
import java.util.*;
import org.example.ecom.dto.FakeStoreCategoryResponseDTO;
import org.example.ecom.gateway.api.FakeStoreCategoryApi;
import org.springframework.stereotype.Component;

@Component
public class FakeStoreCategoryGateway implements ICategoryGateway {

    private final FakeStoreCategoryApi fakeStoreCategoryApi;

    public FakeStoreCategoryGateway(FakeStoreCategoryApi fakeStoreCategoryApi) {
        this.fakeStoreCategoryApi = fakeStoreCategoryApi;
    }

    @Override
    public List<FakeStoreCategoryResponseDTO> getAllCategories() throws IOException {
        List<FakeStoreCategoryResponseDTO> products = this.fakeStoreCategoryApi
                .getAllProducts()
                .execute()
                .body();

        if (products == null || products.isEmpty()) {
            throw new IOException("Empty response from FakeStore API");
        }

        // Map each product's category to a CategoryDTO
        return products ;
    }
}
