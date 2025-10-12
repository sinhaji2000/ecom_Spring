package org.example.ecom.services;
import org.example.ecom.dto.FakeStoreCartDTO;
import org.example.ecom.gateway.FakeStoreCartGateway;
import org.springframework.stereotype.Service;
import java.util.List;
import java.io.IOException;


@Service
public class FakeStoreCartService implements ICartService {


    private final FakeStoreCartGateway fakeStoreCartGateway;
    FakeStoreCartService(FakeStoreCartGateway fakeStoreCartGateway) {
        this.fakeStoreCartGateway = fakeStoreCartGateway;
    }

    @Override
    public List<FakeStoreCartDTO>getCart() throws IOException {
        return fakeStoreCartGateway.getCart();
    }
}
