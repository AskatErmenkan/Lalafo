package service;

import model.User;

public interface UserService {
    void addUser(User user );
User getUser(Long id);

    void deleteUser(Long id);

}
