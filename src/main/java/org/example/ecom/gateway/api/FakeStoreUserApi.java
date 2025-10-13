package org.example.ecom.gateway.api;
import org.example.ecom.dto.FakeStoreUserDTO;
import retrofit2.Call;
import retrofit2.http.GET;

import java.io.IOException;
import java.util.List;

public interface FakeStoreUserApi {

    @GET("/users")
    Call<List<FakeStoreUserDTO>> getUsers() throws IOException;
}
