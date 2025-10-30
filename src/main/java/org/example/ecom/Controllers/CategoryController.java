package org.example.ecom.Controllers;
import org.example.ecom.dto.CategoryDTO;
import org.example.ecom.services.ICartService;
import org.example.ecom.services.ICategoryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.example.ecom.dto.FakeStoreCategoryResponseDTO;
import java.io.IOException;
import java.util.List;


@RestController
@RequestMapping("/api/catogories")
public class CategoryController {

    private final ICategoryService categoryService;


    public CategoryController(ICategoryService categoryService ) {
        this.categoryService = categoryService;

    }

    @GetMapping
    public List<CategoryDTO> getAllProducts() throws IOException {
        return categoryService.getAllCategories(); // returns all data as-is
    }

    @PostMapping
    public ResponseEntity<CategoryDTO> createCategory(@RequestBody CategoryDTO categoryDTO) throws IOException {
        CategoryDTO savedCategory = categoryService.createCateory(categoryDTO);
        return ResponseEntity.ok().body(savedCategory);
    }

}