package org.example.ecom.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.Instant;
@MappedSuperclass
@Getter
@Setter
public class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id ;

    @CreatedDate
    @Column(updatable = false , nullable = false)
    private Instant createdAt ;

    @LastModifiedDate
    @Column( nullable = false)
    private Instant updatedAt ;

    @PrePersist
    public void onCreate(){
        this.createdAt = Instant.now() ;
        this.updatedAt = Instant.now() ;
    }

    @PreUpdate
    public void onUpdate(){
        this.updatedAt = Instant.now() ;
    }
}
