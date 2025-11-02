package org.example.ecom.services;

import org.example.ecom.dto.CategoryDTO;
import org.example.ecom.entity.Category;
import org.example.ecom.exception.CategoryNotFoundExpection;
import org.example.ecom.exception.ProductNotFoundException;
import org.example.ecom.mapper.CategoryMapper;
import org.example.ecom.repository.CategoryRepository;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryService implements ICategoryService{

    private final CategoryRepository categoryRepository ;


    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public List<CategoryDTO>getAllCategories() throws IOException{

        List<Category> categories = categoryRepository.findAll() ;
        List<CategoryDTO> categoryDTOs = new ArrayList<>();
        for(Category category : categories){
            categoryDTOs.add(CategoryMapper.toCategoryDTO(category)) ;
        }

        return  categoryDTOs ;
    }

    @Override
    public CategoryDTO getByName(String name) throws IOException {
        Category category = categoryRepository.findByName(name)
                .orElseThrow(()->new IOException("Category not found"));
        return CategoryMapper.toCategoryDTO(category) ;
    }

    @Override
    public CategoryDTO getCategoryById(long id) throws IOException {
        Category category = categoryRepository.findById(id)
                .orElseThrow(() -> new ProductNotFoundException("Category not found with id: " + id));

        return CategoryMapper.toCategoryDTO(category) ;
    }

    @Override
    public CategoryDTO createCateory(CategoryDTO categoryDTO) throws IOException{

        Category category = CategoryMapper.toCategory(categoryDTO) ;
        Category savedCategory = categoryRepository.save(category);

        // Convert back to DTO for response
        return CategoryMapper.toCategoryDTO(savedCategory) ;
    }


}
