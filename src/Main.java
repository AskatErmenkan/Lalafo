import dao.AnnouncementDao;
import dao.DaoImple.AnnouncementDaoImple;
import dao.DaoImple.UserDaoImple;
import dataBase.DataBase;
import model.Announcement;
import model.GenerateId;
import model.Role;
import model.User;
import service.serviceImple.AnnouncementImple;
import service.serviceImple.UserImple;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        UserDaoImple userDaoImple =new UserDaoImple();
        UserImple u =new UserImple(userDaoImple);
        User user1 = new User(GenerateId.userId(),"Бектур","bektur@jmail.com","Bektur", Role.USER);

        AnnouncementDao announcementDao =new AnnouncementDaoImple();
        AnnouncementImple announcementImple =new AnnouncementImple(announcementDao);
        u.addUser(user1);
        System.out.println(u.getUser(1L));
u.deleteUser(1L);
        System.out.println(u.getUser(1L));

        Announcement announcement = new Announcement(GenerateId.announcementId(),"fdsg","fgsdfg",new BigDecimal(43545),"dfgsdf");
        Announcement announcement1 = new Announcement(GenerateId.announcementId(),"fdsg","fgsdfg",new BigDecimal(43545),"dfgsdf");
        Announcement announcement2= new Announcement(GenerateId.announcementId(),"fdsg","fgsdfg",new BigDecimal(43545),"dfgsdf");
        Announcement announcement3 = new Announcement(GenerateId.announcementId(),"fdsg","fgsdfg",new BigDecimal(43545),"dfgsdf");
        Announcement announcement4 = new Announcement(GenerateId.announcementId(),"fdsg","fgsdfg",new BigDecimal(43545),"dfgsdf");
announcementDao.addAnnouncement(announcement);
announcementDao.addAnnouncement(announcement1);
announcementDao.addAnnouncement(announcement2);
announcementDao.addAnnouncement(announcement3);
announcementDao.addAnnouncement(announcement4);


        System.out.println(announcementDao.getAllAnnouncements());

    }


}