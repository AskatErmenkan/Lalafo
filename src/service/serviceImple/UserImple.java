package service.serviceImple;

import dao.DaoImple.UserDaoImple;
import dao.UserDao;
import model.User;
import service.UserService;

import java.util.List;

public class UserImple implements UserService {
   private UserDaoImple userDao;

    public UserImple(UserDaoImple userDao) {
        this.userDao = userDao;
    }

    @Override
    public void addUser(User user) {
        userDao.addUser(user);
    }

    @Override
    public User getUser(Long id) {
        return userDao.getUser(id);
    }

    @Override
    public void deleteUser(Long id) {
        userDao.deleteUser(id);

    }

    @Override
    public String updateById(Long id, String newName) {
        return userDao.updateById(id,newName);
    }

    @Override
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }
}
