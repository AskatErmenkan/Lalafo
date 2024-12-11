package dao;

import model.Announcement;

import java.util.List;

public interface AnnouncementDao {
    void addAnnouncement(Announcement announcement);
    Announcement getAnnouncementbyId(Long id);
    String updateAnnouncement(Long id,String newName);
    List<Announcement> getAllAnnouncements();
    void deleteAnnouncement(Long id);
}
