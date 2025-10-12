package org.example.ecom.Configuration;


import org.example.ecom.gateway.api.FakeStoreCategoryApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Configuration
public class RetroFitConfig {


    @Bean
    public Retrofit retrofit(){
        return new Retrofit.Builder()
                .baseUrl("https://fakestoreapi.com")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

    }

    @Bean
    public FakeStoreCategoryApi fakeStoreCategotyApi(){
        return retrofit().create(FakeStoreCategoryApi.class);
    }
}
