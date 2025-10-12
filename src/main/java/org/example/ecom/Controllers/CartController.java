package org.example.ecom.Controllers;

import org.example.ecom.dto.FakeStoreCartDTO;
import org.example.ecom.services.ICartService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api/carts")
public class CartController {

    private final ICartService cartService;

    public CartController( ICartService cartService) {
        this.cartService = cartService;
    }

    @GetMapping
    public List<FakeStoreCartDTO> getAllCart() throws IOException {

        return cartService.getCart() ;
    }
}
