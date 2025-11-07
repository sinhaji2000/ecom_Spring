package org.example.ecom.entity;

import java.util.List ;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "category")
public class Category extends BaseEntity{




    private String name ;

    @OneToMany(mappedBy = "category" , fetch = FetchType.LAZY , cascade = CascadeType.ALL)
    private List<Product> products;

}
