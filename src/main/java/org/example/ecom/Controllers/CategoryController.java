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
    public ResponseEntity<?> getAllProducts(@RequestParam(required = false) String name) throws IOException {

        if(name != null && !name.isBlank()){
            CategoryDTO categoryDTO = categoryService.getByName(name) ;
            return ResponseEntity.ok(categoryDTO) ;
        }else{

            List<CategoryDTO>result = categoryService.getAllCategories() ;
            return ResponseEntity.ok(result) ;
        }

    }

    @PostMapping
    public ResponseEntity<CategoryDTO> createCategory(@RequestBody CategoryDTO categoryDTO) throws IOException {
        CategoryDTO savedCategory = categoryService.createCateory(categoryDTO);
        return ResponseEntity.ok().body(savedCategory);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getCategoryById(@PathVariable long id) throws IOException {

        CategoryDTO categoryDTO = categoryService.getCategoryById(id) ;
        return ResponseEntity.ok(categoryDTO) ;
    }

}