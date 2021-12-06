package application.service;

import application.model.User;

import java.util.List;

public interface UserService {
    List<User> allUsers();

    void add(User user);

    void remove(User user);

    void edit(User user);

    User getById(long id);
}
