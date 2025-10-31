package org.example.ecom.mapper;

import org.example.ecom.dto.CategoryDTO;
import org.example.ecom.entity.Category;

public class CategoryMapper {

    public static Category toCategory(CategoryDTO categoryDTO){

        Category category = new Category();
        category.setName(categoryDTO.getName()) ;
        return category ;
    }

    public static CategoryDTO toCategoryDTO(Category category){
        CategoryDTO categoryDTO = new CategoryDTO() ;
        categoryDTO.setName(category.getName()) ;
        categoryDTO.setId( category.getId() ) ;
        return categoryDTO ;
    }
}
