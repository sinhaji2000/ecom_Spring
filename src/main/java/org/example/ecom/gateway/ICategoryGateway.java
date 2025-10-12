package org.example.ecom.gateway;
import java.io.IOException;
import java.util.List;
import org.example.ecom.dto.CategoryDTO;
import org.example.ecom.dto.FakeStoreCategoryResponseDTO;

public interface ICategoryGateway{

    List<FakeStoreCategoryResponseDTO>getAllCategories() throws IOException;
}
