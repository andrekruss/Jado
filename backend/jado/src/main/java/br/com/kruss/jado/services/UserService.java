package br.com.kruss.jado.services;

import br.com.kruss.jado.dtos.CreateUserDTO;
import br.com.kruss.jado.entities.User;
import br.com.kruss.jado.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User createUser(CreateUserDTO createUserDTO) {
        User user = new User(createUserDTO.getUsername(), createUserDTO.getEmail(), createUserDTO.getPassword());
        return userRepository.save(user);
    }
}
