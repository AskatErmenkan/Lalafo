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
    public Announcement getAnnouncementbyId(Long id) {
        for (Announcement announcement : DataBase.getAnnouncements()) {
            if (announcement.getId() == id) {
                return announcement;
            };
        }

        return null;
    }

    @Override
    public String updateAnnouncement(Long id,String newName) {
    for (Announcement announcement1 : DataBase.getAnnouncements()) {
        if (announcement1.getId() == announcement1.getId()) {
            announcement1.setName(newName);
            return "Успешно жаныртылды";

        }
    }
        return null;
    }

    @Override
    public List<Announcement> getAllAnnouncements() {
        return DataBase.getAnnouncements();
    }

    @Override
    public void deleteAnnouncement(Long id) {
    for (Announcement announcement : DataBase.getAnnouncements()) {
        if (announcement.getId() == id) {
            DataBase.getAnnouncements().remove(announcement);
            System.out.println("очурулду");
        }
    }
    }
}
