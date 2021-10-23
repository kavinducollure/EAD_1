package com.example.unibank.service;

import com.example.unibank.model.User;
import com.example.unibank.repository.userRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class userServiceImpl implements userService {

    @Autowired
    private userRepository userRepository;

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public void saveUser(User user) {
    this.userRepository.save(user);
    }

    @Override
    public User getUserById(Integer id) {
        Optional<User> optional = userRepository.findById(id);
        User user = null;
        if(optional.isPresent()){
            user = optional.get();
        }else{
            throw new RuntimeException(" Employee not found for id :: " + id);
        }
        return user;
    }

    @Override
    public void deleteUserById(Integer id) {
        this.userRepository.deleteById(id);

    }
}
