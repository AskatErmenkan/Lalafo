package service;

import model.User;

import java.util.List;

public interface UserService {
    void addUser(User user);

    User getUser(Long id);

    void deleteUser(Long id);
    String updateById(Long id, String newName);
    List<User> getAllUsers();

}
