package dao.DaoImple;

import dao.AnnouncementDao;
import dataBase.DataBase;
import model.Announcement;

import java.util.List;

public class AnnouncementDaoImple implements AnnouncementDao {

    @Override
    public void addAnnouncement(Announcement announcement) {
        DataBase.getAnnouncements().add(announcement);
        System.out.println(announcement + " Успешно кошулду");
    }

    @Override
    public void getAnnouncementbyId(Long id) {

    }

    @Override
    public void updateAnnouncement(Announcement announcement) {

    }

    @Override
    public List<Announcement> getAllAnnouncements() {
        return List.of();
    }

    @Override
    public void deleteAnnouncement(long id) {

    }
}
