CREATE TABLE product (
        id BIGINT AUTO_INCREMENT PRIMARY KEY,
        name VARCHAR(255),
        color VARCHAR(20),
        price INT,
        description VARCHAR(255),
        discount INT,
        model VARCHAR(255),
        title VARCHAR(100),
        brand VARCHAR(100),
        is_popular BOOLEAN DEFAULT FALSE,
        category_id BIGINT NOT NULL,
        created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
        updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
        CONSTRAINT fk_category FOREIGN KEY (category_id) REFERENCES category(id)
);