package org.example.ecom.gateway.api;

import org.example.ecom.dto.FakeStoreProductResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

import java.io.IOException;

public interface FakeStoreProductApi {

    @GET("products/{id}")
    Call<FakeStoreProductResponse> getProductById(@Path("id") Long id) throws IOException;
}
