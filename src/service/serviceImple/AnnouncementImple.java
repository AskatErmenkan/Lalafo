package service.serviceImple;

import dao.AnnouncementDao;
import model.Announcement;
import service.AnnouncementService;

import java.util.List;

public class AnnouncementImple implements AnnouncementService {
    AnnouncementDao announcementDao;

    public AnnouncementImple(AnnouncementDao announcementDao) {
        this.announcementDao = announcementDao;
    }

    @Override
    public void addAnnouncement(Announcement announcement) {
        announcementDao.addAnnouncement(announcement);
    }

    @Override
    public Announcement getAnnouncementbyId(Long id) {
        return announcementDao.getAnnouncementbyId(id);
    }

    @Override
    public String updateAnnouncement(Announcement announcement) {
        return "";
    }

    @Override
    public List<Announcement> getAllAnnouncements() {
        return announcementDao.getAllAnnouncements();
    }

    @Override
    public void deleteAnnouncement(Long id) {
announcementDao.deleteAnnouncement(id);
    }

}
