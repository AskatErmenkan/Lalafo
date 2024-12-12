import dao.AnnouncementDao;
import dao.DaoImple.AnnouncementDaoImple;
import dao.DaoImple.FavoriteDaoImple;
import dao.DaoImple.UserDaoImple;
import dataBase.DataBase;
import model.Announcement;
import model.GenerateId;
import model.Role;
import model.User;
import service.serviceImple.AnnouncementImple;
import service.serviceImple.FavoriteImpl;
import service.serviceImple.UserImple;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        UserDaoImple userDaoImple = new UserDaoImple();
        UserImple u = new UserImple(userDaoImple);

        AnnouncementDao announcementDao = new AnnouncementDaoImple();
        AnnouncementImple an = new AnnouncementImple(announcementDao);

        FavoriteDaoImple favoriteDaoImple = new FavoriteDaoImple();
        FavoriteImpl f = new FavoriteImpl(favoriteDaoImple);
        Scanner scanner2 = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        Scanner scanner3 = new Scanner(System.in);

        User user1 = new User(GenerateId.userId(), "Бектур", "bektur@jmail.com", "Bektur", Role.USER);
        User user2 = new User(GenerateId.userId(), "Adilet", "bektur@jmail.com", "Bektur", Role.USER);

        Announcement announcement1 = new Announcement(GenerateId.announcementId(), "fdsg", "fgsdfg", new BigDecimal(43545), "dfgsdf");
        Announcement announcement2 = new Announcement(GenerateId.announcementId(), "fdsg", "fgsdfg", new BigDecimal(43545), "dfgsdf");
        Announcement announcement3 = new Announcement(GenerateId.announcementId(), "fdsg", "fgsdfg", new BigDecimal(43545), "dfgsdf");

        while (true) {

            System.out.println("1. addUser");
            System.out.println("2. getUserById");
            System.out.println("3. deleteUser");
            System.out.println("4. updateUser");
            System.out.println("5. get allUsers");
            System.out.println("6. addAnnouncement");
            System.out.println("7. deleteAnnouncement");
            System.out.println("8. updateAnnouncement");
            System.out.println("9. getAllAnnouncements");
            System.out.println("10. getAnnouncementById");
            System.out.println("11. addFavorite");
            System.out.println("12. deleteFavorite");
            System.out.println("13. getallfavoriten");
            int a = scanner.nextInt();
            switch (a) {
                case 1: {
                    u.addUser(user1);
                    u.addUser(user2);
                    break;
                }
                case 2: {
                    System.out.println(" User дин айдисин жазыныз");
                    long id = scanner1.nextLong();
                    System.out.println(u.getUser(id));
                    break;
                }
                case 3: {
                    System.out.println("User дин айдисин жазыныз");
                    long id = scanner1.nextLong();
                    u.deleteUser(id);
                    break;
                }
                case 4: {
                    System.out.println("User дин айдисин жазыныз");
                    long id = scanner1.nextLong();
                    System.out.println("Жаны ат жазыныз");
                    String name = scanner2.next();
                    System.out.println(u.updateById(id, name));
                    break;
                }
                case 5: {
                    System.out.println(u.getAllUsers());
                    break;
                }
                case 6: {
                    an.addAnnouncement(announcement1);
                    an.addAnnouncement(announcement2);
                    break;
                }
                case 7: {
                    System.out.println("Айдисин жазыныз");
                    long id = scanner1.nextLong();
                    an.deleteAnnouncement(id);
                    break;
                }
                case 8: {
                    System.out.println("Anouncment дин айдисин жазыныз");
                    long id = scanner1.nextLong();
                    System.out.println("Жаны ат жазыныз");
                    String name = scanner2.next();
                    System.out.println(an.updateAnnouncement(id, name));
                    break;
                }

                case 9: {
                    System.out.println(an.getAllAnnouncements());
                    break;
                }
                case 10: {
                    System.out.println(" Announcment дин айдисин жазыныз");
                    long id = scanner1.nextLong();
                    System.out.println(an.getAnnouncementbyId(id));
                    break;
                }
                case 11: {
                    System.out.println("User айдисин жазыныз");
                    long userid = scanner1.nextLong();
                    System.out.println("announcment айдисин жазыныз");
                    long anid = scanner1.nextLong();
                    String result = f.addFavorite(userid, anid);
                    System.out.println(result);
                    break;
                }
                case 12: {
                    System.out.println("User айдисин жазыныз");
                    long userid = scanner1.nextLong();
                    System.out.println("announcment айдисин жазыныз");
                    long anid = scanner1.nextLong();
                    System.out.println(f.removeFavorite(userid, anid));

                    break;
                }
                case 13: {
                    System.out.println(f.getallfavorites());
                    break;
                }

            }
        }


    }


}