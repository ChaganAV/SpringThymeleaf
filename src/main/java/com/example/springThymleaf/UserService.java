package com.example.springThymleaf;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    public List<User> getAllUsers(){
        userRepository.save(new User(null,"John","john@gmail.com"));
        userRepository.save(new User(null,"Bon","bon@gmail.com"));
        userRepository.save(new User(null,"Kate","kate@gmail.com"));
        return userRepository.findAll();
    }

    public User getUserById(Long id){
        return userRepository.findById(id);
    }
}
