package org.nari.service;


import org.nari.model.User;

public interface UserService {
    boolean login(User user);

    User register(User user);

    User modifyUser(User user);

    User getUserInfo(String account);

    boolean modifyPassword(User user);
}
