package com.studi.library.service.impl;

import com.studi.library.pojo.User;
import com.studi.library.repository.UserRepository;
import com.studi.library.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public boolean findUser(String username) {
        return userRepository.findByUsername(username).isPresent();
    }

    @Override
    public void create(User user) {
        userRepository.save(user);
    }
}
