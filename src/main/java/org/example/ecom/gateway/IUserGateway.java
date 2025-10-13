package org.example.ecom.gateway;
import java.io.IOException;
import java.util.List ;
import org.example.ecom.dto.FakeStoreUserDTO;

public interface IUserGateway {


    public List<FakeStoreUserDTO>getUser() throws IOException;
}
