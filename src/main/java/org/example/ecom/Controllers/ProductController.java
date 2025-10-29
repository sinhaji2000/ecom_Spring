package org.example.ecom.Controllers;



import org.example.ecom.dto.FakeStoreProductResponse;
import org.example.ecom.dto.ProductDTO;
import org.example.ecom.services.IProductService;
import org.example.ecom.services.ProductService ;
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
    public ResponseEntity<ProductDTO>getProductById(@PathVariable Long id) throws IOException {

       ProductDTO product = productService.getProductById(id);

        if (product != null) {
            return ResponseEntity.ok(product); // 200 OK
        } else {
            return ResponseEntity.notFound().build(); // 404 Not Found
        }
    }

    @PostMapping
    public ResponseEntity<ProductDTO> createProduct(@RequestBody ProductDTO productDTO) throws IOException {
        ProductDTO savedProduct = productService.createProduct(productDTO);
        return ResponseEntity.ok(savedProduct);
    }

}
