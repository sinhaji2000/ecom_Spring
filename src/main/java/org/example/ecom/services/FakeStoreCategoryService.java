package org.example.ecom.services;
import org.example.ecom.dto.FakeStoreCategoryResponseDTO;
import org.example.ecom.gateway.ICategoryGateway;
import org.springframework.stereotype.Service;


import java.io.IOException;
import  java.util.*;
@Service
public class FakeStoreCategoryService implements ICategoryService{

    private final ICategoryGateway categoryGateway;
    public FakeStoreCategoryService(ICategoryGateway _categoryGateway) {
        this.categoryGateway = _categoryGateway;
    }

    @Override
    public List<FakeStoreCategoryResponseDTO> getAllCategories() throws IOException {
        return categoryGateway.getAllCategories();
    }
}
