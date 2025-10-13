package org.example.ecom.services;
import org.example.ecom.dto.FakeStoreUserDTO;
import org.example.ecom.gateway.IUserGateway;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;

@Component
public class FakeStoreUserService implements IUserService{

    private final IUserGateway userGateway;
    FakeStoreUserService(IUserGateway userGateway){

        this.userGateway = userGateway;
    }

    @Override
    public List<FakeStoreUserDTO>getUser() throws IOException {
        return userGateway.getUser();
    }
}
