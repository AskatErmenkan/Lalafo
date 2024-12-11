package dao.DaoImple;

import dao.UserDao;
import dataBase.DataBase;
import model.User;

import java.util.List;

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

    @Override
    public void deleteUser(Long id) {
        for (User user : DataBase.getUsers()) {
           if (user.getId() == id) {
               DataBase.getUsers().remove(user);
               System.out.println("очурулду");
           }
       }
    }

    @Override
    public String updateById(Long id, String newName) {
        for (User user : DataBase.getUsers()) {
            if (user.getId() == id) {
user.setFirstName(newName);
return "updated";
            }
        }
        return "";
    }

    @Override
    public List<User> getAllUsers() {
        return DataBase.getUsers();
    }
}
