package org.example.ecom.gateway;

import org.example.ecom.dto.FakeStoreProductResponse;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;

@Component("fakeStoreRestTemplateGateway")
public class FakeStoreRestTemplateGatewat implements IProductGateway {


    private final RestTemplateBuilder restTemplateBuilder;
    public FakeStoreRestTemplateGatewat(RestTemplateBuilder restTemplateBuilder) {
    this.restTemplateBuilder = restTemplateBuilder;
    }

    @Override
    public FakeStoreProductResponse getProductById(Long id) throws IOException {

        RestTemplate restTemplate = restTemplateBuilder.build();
        String url = "https://fakestoreapi.com/products/"+id ;

        ResponseEntity<FakeStoreProductResponse>response =  restTemplate.getForEntity(url, FakeStoreProductResponse.class);

        if(response.getBody() == null){
            throw new IOException("failed to get product");
        }

        return response.getBody();

    }
}
