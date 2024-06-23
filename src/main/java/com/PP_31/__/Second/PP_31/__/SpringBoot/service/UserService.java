package com.PP_31.__.Second.PP_31.__.SpringBoot.service;
import com.PP_31.__.Second.PP_31.__.SpringBoot.model.User;


import java.util.List;

public interface UserService {

    List<User> allUsers();
    User getUserId(int id);
    void addUser(User user);
    void updateUser(int id,User user);
    void deleteUser(int id);
}
