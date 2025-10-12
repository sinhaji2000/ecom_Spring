package org.example.ecom.services;
import org.example.ecom.dto.CategoryDTO;
import org.example.ecom.dto.FakeStoreCategoryResponseDTO;

import java.io.IOException;
import  java.util.*;

public interface ICategoryService {


    public List<FakeStoreCategoryResponseDTO> getAllCategories() throws IOException;
}
