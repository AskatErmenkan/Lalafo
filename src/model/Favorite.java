package model;

import java.util.List;

public class Favorite {
    private Long id;
    List<User> users;
    List<Announcement> announcements;

    public Favorite(Long id,List<User> users, List<Announcement> announcements) {
        this.id = id;
        this.users = users;
        this.announcements = announcements;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public List<Announcement> getAnnouncements() {
        return announcements;
    }

    public void setAnnouncements(List<Announcement> announcements) {
        this.announcements = announcements;
    }

    @Override
    public String toString() {
        return "\nFavorite{" +
                "id=" + id +
                ", users=" + users +
                ", announcements=" + announcements +
                '}';
    }
}
