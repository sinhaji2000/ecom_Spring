package org.example.ecom.services;
import org.example.ecom.dto.CategoryDTO;
import org.example.ecom.dto.FakeStoreCategoryResponseDTO;
import org.example.ecom.entity.Category;

import java.io.IOException;
import  java.util.*;

public interface ICategoryService {


    public List<CategoryDTO> getAllCategories() throws IOException;
    public CategoryDTO getByName(String name) throws IOException;

    public CategoryDTO createCateory(CategoryDTO categoryDTO) throws IOException;

}
