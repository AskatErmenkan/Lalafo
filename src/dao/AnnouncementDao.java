package dao;

import model.Announcement;

import java.util.List;

public interface AnnouncementDao {
    void addAnnouncement(Announcement announcement);
    void getAnnouncementbyId(Long id);
    void updateAnnouncement(Announcement announcement);
    List<Announcement> getAllAnnouncements();
    void deleteAnnouncement(long id);
}
