package org.example.ecom.services;
import java.io.IOException;
import java.util.List ;
import org.example.ecom.dto.FakeStoreUserDTO;

public interface IUserService {

    public List<FakeStoreUserDTO>getUser() throws IOException;
}
