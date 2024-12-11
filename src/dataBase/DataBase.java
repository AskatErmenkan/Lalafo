package dataBase;

import model.Announcement;
import model.Favorite;
import model.User;

import java.util.ArrayList;
import java.util.List;

public class DataBase {
    public static List<User> users = new ArrayList<User>();
    public static List<Announcement> announcements = new ArrayList<>();
    public static List<Favorite> favorites = new ArrayList<>();

    public static List<User> getUsers() {
        return users;
    }

    public static List<Announcement> getAnnouncements() {
        return announcements;
    }

    public static List<Favorite> getFavorites() {
        return favorites;
    }
}
