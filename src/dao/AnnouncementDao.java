package dao;

import model.Announcement;

import java.util.List;

public interface AnnouncementDao {
    void addAnnouncement(Announcement announcement);
    Announcement getAnnouncementbyId(Long id);
    String updateAnnouncement(Announcement announcement);
    List<Announcement> getAllAnnouncements();
    void deleteAnnouncement(Long id);
}
