package org.example.ecom.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class FakeStoreCartDTO {
    private int id;
    private int userId;
    private String date;
    private List<ProductItem> products;
    private int __v;

    // Inner class to represent the "products" array
    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class ProductItem {
        private int productId;
        private int quantity;
    }
}
