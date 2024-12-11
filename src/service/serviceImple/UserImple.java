package service.serviceImple;

import dao.DaoImple.UserDaoImple;
import dao.UserDao;
import model.User;
import service.UserService;

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
}
