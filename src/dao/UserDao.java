package dao;

import dataBase.DataBase;
import model.User;

public interface UserDao {
    void addUser(User user );
    User getUser(Long id);
}
