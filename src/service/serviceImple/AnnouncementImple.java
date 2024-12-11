package service.serviceImple;

import dao.AnnouncementDao;
import model.Announcement;
import service.AnnouncementService;

public class AnnouncementImple implements AnnouncementService {
    AnnouncementDao announcementDao;
    @Override
    public void addAnnouncement(Announcement announcement) {
        announcementDao.addAnnouncement(announcement);
    }
}
