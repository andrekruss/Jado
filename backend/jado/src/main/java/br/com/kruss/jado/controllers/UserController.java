package br.com.kruss.jado.controllers;

import br.com.kruss.jado.dtos.CreateUserDTO;
import br.com.kruss.jado.services.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity<String> createUser(@RequestBody @Valid CreateUserDTO createUserDTO) {
        userService.createUser(createUserDTO);
        return ResponseEntity.ok("User created");
    }
}
