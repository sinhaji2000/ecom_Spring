package org.example.ecom.gateway;

import org.example.ecom.dto.FakeStoreCartDTO;
import org.example.ecom.gateway.api.FakeStoreCartApi;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;

@Component
public class FakeStoreCartGateway implements ICartGateway {


    private final FakeStoreCartApi fakeStoreCartApi;
    FakeStoreCartGateway(FakeStoreCartApi fakeStoreCartApi) {
        this.fakeStoreCartApi = fakeStoreCartApi;
    }

    @Override
    public List<FakeStoreCartDTO>getCart() throws IOException {
        List<FakeStoreCartDTO> cart = this.fakeStoreCartApi
                .getCarts()
                .execute()
                .body() ;

        return cart ;

    }
}
