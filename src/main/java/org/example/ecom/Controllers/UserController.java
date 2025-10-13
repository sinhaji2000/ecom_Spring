package org.example.ecom.Controllers;


import org.example.ecom.dto.FakeStoreUserDTO;
import org.example.ecom.services.IUserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final IUserService userService;
    public UserController(IUserService userService) {
        this.userService = userService;
    }

    @GetMapping
    List<FakeStoreUserDTO>getUsers() throws IOException {
        return userService.getUser() ;
    }
}
