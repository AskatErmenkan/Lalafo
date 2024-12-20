package service;

import model.Announcement;

import java.util.List;

public interface AnnouncementService {
    void addAnnouncement(Announcement announcement);
    Announcement getAnnouncementbyId(Long id);
    String updateAnnouncement(Long id,String newName);
    List<Announcement> getAllAnnouncements();
    void deleteAnnouncement(Long id);}
