package dao.DaoImple;

import dao.UserDao;
import dataBase.DataBase;
import model.User;

public class UserDaoImple implements UserDao {



    public void addUser(User user) {
        System.out.println("Кошулду");
        DataBase.getUsers().add(user);
    }

    @Override
    public User getUser(Long id) {
        for (User user : DataBase.getUsers()) {

            if (user.getId() == id) {

                return user;
            }
        }
        return null;
    }
}
