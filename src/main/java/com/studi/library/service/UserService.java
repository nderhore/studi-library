package com.studi.library.service;

import com.studi.library.pojo.User;

public interface UserService {
    boolean findUser(String username);

    void create(User user);
}
