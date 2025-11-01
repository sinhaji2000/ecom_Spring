package org.example.ecom.services;

import org.example.ecom.dto.FakeStoreProductResponse;
import org.example.ecom.dto.ProductDTO;
import org.example.ecom.dto.ProductWithCateoryDTO;
import org.example.ecom.entity.Product;
import org.example.ecom.gateway.IProductGateway;
import org.example.ecom.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class FakeStoreProductService implements IProductService{

    private final IProductGateway productGateway;
    public FakeStoreProductService(@Qualifier("fakeStoreRestTemplateGateway") IProductGateway productGateway) {
        this.productGateway = productGateway;
    }

    @Override
    public ProductDTO getProductById(Long id)  throws IOException {
        FakeStoreProductResponse response = productGateway.getProductById(id) ;
        return ProductMapper.toProductDTO(response);
    }

    public ProductDTO createProduct(ProductDTO productDTO){
        return null;
    }

    public ProductWithCateoryDTO getProductWithCategory(Long id) throws IOException{
        return null;
    }

}
