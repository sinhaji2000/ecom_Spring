package org.example.ecom.dto;

import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class FakeStoreCategoryResponseDTO {
    private int id;
    private String title;
    private double price;
    private String description;
    private String category;
    private String image;
    private Rating rating;  // nested object

    @Data
    public static class Rating {
        private double rate;
        private int count;
    }
}
