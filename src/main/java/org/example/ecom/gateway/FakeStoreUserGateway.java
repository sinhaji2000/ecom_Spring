package org.example.ecom.gateway;


import org.example.ecom.dto.FakeStoreUserDTO;
import org.example.ecom.gateway.api.FakeStoreUserApi;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;

@Component
public class FakeStoreUserGateway implements IUserGateway {

    private final FakeStoreUserApi fakeStoreUserApi;
    public FakeStoreUserGateway(FakeStoreUserApi fakeStoreUserApi) {
        this.fakeStoreUserApi = fakeStoreUserApi;
    }

    @Override
    public List<FakeStoreUserDTO> getUser() throws IOException {
        List<FakeStoreUserDTO>users = this.fakeStoreUserApi
                .getUsers()
                .execute()
                .body() ;

        return users;
    }
}
