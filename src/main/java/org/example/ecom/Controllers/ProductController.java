package org.example.ecom.Controllers;



import org.example.ecom.dto.FakeStoreProductResponse;
import org.example.ecom.dto.ProductDTO;
import org.example.ecom.dto.ProductWithCateoryDTO;
import org.example.ecom.exception.ProductNotFoundException;
import org.example.ecom.services.IProductService;
import org.example.ecom.services.ProductService ;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
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
    public ResponseEntity<?>getProductById(@PathVariable Long id) {

        try{
            ProductDTO product = productService.getProductById(id);
            return ResponseEntity.ok(product); // 200 OK
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Product not Found") ;
        }
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

    @ExceptionHandler(ProductNotFoundException.class)
    public ResponseEntity<String> handleProductNotFoundException(ProductNotFoundException e){
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
    }


}
