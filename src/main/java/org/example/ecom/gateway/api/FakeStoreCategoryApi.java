package org.example.ecom.gateway.api;
import java.util.* ;
import org.example.ecom.dto.FakeStoreCategoryResponseDTO;
import org.springframework.stereotype.Component;
import retrofit2.Call;
import retrofit2.http.GET;

@Component
public interface FakeStoreCategoryApi {

    @GET("products")
    Call<List<FakeStoreCategoryResponseDTO>> getAllProducts();

}
