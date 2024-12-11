import dao.DaoImple.UserDaoImple;
import dataBase.DataBase;
import model.GenerateId;
import model.Role;
import model.User;
import service.serviceImple.UserImple;

public class Main {
    public static void main(String[] args) {

        UserDaoImple userDaoImple =new UserDaoImple();
        UserImple u =new UserImple(userDaoImple);
        User user1 = new User(GenerateId.userId(),"Бектур","bektur@jmail.com","Bektur", Role.USER);
        u.addUser(user1);
        System.out.println(u.getUser(1L));
u.deleteUser(1L);
        System.out.println(u.getUser(1L));

    }


}