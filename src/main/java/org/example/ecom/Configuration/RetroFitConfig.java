package org.example.ecom.Configuration;


import org.example.ecom.gateway.api.FakeStoreCategoryApi;
import org.example.ecom.gateway.api.FakeStoreCartApi;
import org.example.ecom.gateway.api.FakeStoreProductApi;
import org.example.ecom.gateway.api.FakeStoreUserApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import io.github.cdimascio.dotenv.Dotenv;

@Configuration
public class RetroFitConfig {

    private final Dotenv dotenv = Dotenv.configure()
            .ignoreIfMissing() // optional: doesn't fail if .env missing
            .load();


    @Bean
    public Retrofit retrofit(){
        String baseUrl = dotenv.get("FAKE_STORE");
        return new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

    }

    @Bean
    public FakeStoreCategoryApi fakeStoreCategotyApi(){
        return retrofit().create(FakeStoreCategoryApi.class);
    }

    @Bean
    public FakeStoreCartApi fakeStoreCartApi() {
        return retrofit().create(FakeStoreCartApi.class);
    }

    @Bean
    public FakeStoreUserApi fakeStoreUserApi(){
        return retrofit().create(FakeStoreUserApi.class);
    }
    @Bean
    public FakeStoreProductApi fakeStoreProductApi() {
        return retrofit().create(FakeStoreProductApi.class);
    }
}
