package org.example.ecom.gateway.api;


import org.example.ecom.dto.FakeStoreCartDTO;
import org.springframework.stereotype.Component;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

import java.util.* ;
import java.io.IOException;

@Component
public interface FakeStoreCartApi {

    @GET("/carts")
    Call<List<FakeStoreCartDTO>> getCarts() ;
}
