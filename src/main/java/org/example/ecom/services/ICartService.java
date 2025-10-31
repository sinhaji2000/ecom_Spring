package org.example.ecom.services;
import org.example.ecom.dto.FakeStoreCartDTO;


import java.util.* ;
import java.io.IOException;

public interface ICartService {
    public List<FakeStoreCartDTO>getCart() throws IOException;



}
