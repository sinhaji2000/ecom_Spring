package org.example.ecom.services;

import org.example.ecom.dto.ProductDTO;
import org.example.ecom.dto.ProductWithCateoryDTO;
import org.example.ecom.entity.Category;
import org.example.ecom.entity.Product;
import org.example.ecom.exception.ProductNotFoundException;
import org.example.ecom.mapper.ProductMapper;
import org.example.ecom.repository.CategoryRepository;
import org.example.ecom.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ProductService implements IProductService{

    private final ProductRepository productRepository;
    private final CategoryRepository categoryRepository;
    public ProductService( ProductRepository productRepository , CategoryRepository categoryRepository) {
        this.productRepository = productRepository;
        this.categoryRepository = categoryRepository ;
    }

    @Override
    public ProductDTO getProductById(Long id) {
        return productRepository.findById(id)
                .map(ProductMapper::toProductDTO)
                .orElseThrow(() -> new ProductNotFoundException("Product not found with id: " + id));
    }

    @Override
    public ProductDTO createProduct(ProductDTO productDTO){

        Category category = categoryRepository.findById(productDTO.getCategoryId())
                .orElseThrow(() -> new ProductNotFoundException("Category not found with id: " + productDTO.getCategoryId()));
        Product saved =  productRepository.save(ProductMapper.toEntity(productDTO , category));
        return ProductMapper.toProductDTO(saved);
    }


    @Override
    public ProductWithCateoryDTO getProductWithCategory(Long id){

        Product product = productRepository.findById(id).orElseThrow(() -> new RuntimeException("Product not found with id: " + id));
        return ProductMapper.toProductWithCateoryDTO(product);
    }




}
