package org.example.ecom.exception;

public class CategoryNotFoundExpection extends RuntimeException {

    public CategoryNotFoundExpection(String message) {
        super(message);
    }
}
