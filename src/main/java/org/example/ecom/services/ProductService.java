package org.example.ecom.services;

import org.example.ecom.dto.ProductDTO;
import org.example.ecom.entity.Product;
import org.example.ecom.mapper.ProductMapper;
import org.example.ecom.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ProductService implements IProductService{

    private final ProductRepository productRepository;
    public ProductService( ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public ProductDTO getProductById(Long id) {
        return productRepository.findById(id)
                .map(ProductMapper::toProductDTO)
                .orElseThrow(() -> new RuntimeException("Product not found with id: " + id));
    }

    @Override
    public ProductDTO createProduct(ProductDTO productDTO){
        Product saved =  productRepository.save(ProductMapper.toEntity(productDTO));
        return ProductMapper.toProductDTO(saved);
    }




}
