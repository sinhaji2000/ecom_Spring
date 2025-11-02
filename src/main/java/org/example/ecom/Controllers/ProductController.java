package org.example.ecom.Controllers;




import org.example.ecom.dto.ProductDTO;
import org.example.ecom.dto.ProductWithCateoryDTO;
import org.example.ecom.exception.ProductNotFoundException;
import org.example.ecom.services.IProductService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;


import java.io.IOException;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    public final IProductService productService; ;

    ProductController(@Qualifier("productService") IProductService productService) {
        this.productService = productService;
    }
    @GetMapping("/{id}")
    public ResponseEntity<?>getProductById(@PathVariable Long id) throws IOException {


            ProductDTO product = productService.getProductById(id);
            return ResponseEntity.ok(product); // 200 OK

    }

    @PostMapping
    public ResponseEntity<ProductDTO> createProduct(@RequestBody ProductDTO productDTO) throws IOException {
        ProductDTO savedProduct = productService.createProduct(productDTO);
        return ResponseEntity.ok(savedProduct);
    }

    @GetMapping("/{id}/details")
    public ResponseEntity<ProductWithCateoryDTO>getProductwithCategory(@PathVariable Long id) throws IOException {

        ProductWithCateoryDTO dto = productService.getProductWithCategory(id) ;
        return ResponseEntity.ok(dto);
    }




}
