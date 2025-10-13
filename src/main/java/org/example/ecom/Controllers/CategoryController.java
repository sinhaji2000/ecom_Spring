package org.example.ecom.Controllers;
import org.example.ecom.services.ICartService;
import org.example.ecom.services.ICategoryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
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
    public List<FakeStoreCategoryResponseDTO> getAllProducts() throws IOException {
        return categoryService.getAllCategories(); // returns all data as-is
    }

}