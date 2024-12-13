package dao.DaoImple;

import dao.FavoriteDao;
import dataBase.DataBase;
import model.Announcement;
import model.Favorite;
import model.User;

import java.util.ArrayList;
import java.util.List;

public class FavoriteDaoImple  implements FavoriteDao {
    @Override
    public String addFavorite(Favorite favorite) {
        DataBase.getFavorites().add(favorite);
        return "Favorite added";
    }


    @Override
    public String removeFavorite(Long id) {
        for (Favorite favorite : DataBase.getFavorites()) {
            if (favorite.getId() == id) {
                DataBase.getFavorites().remove(favorite);
                return "Favorite removed";
            }
        }
        return "мындай айдиде Favorite жок";
    }

    @Override
    public List<Favorite> getallfavorites() {

        return DataBase.getFavorites();
    }

    public String addUserstoFavorite(Long favoriteId, List<Long> userId) {
        for (Favorite favorite : DataBase.getFavorites()) {
            if (favorite.getId() == favoriteId) {
                List<User> userscopy = new ArrayList<>(DataBase.getUsers());
                for (User user : userscopy) {
                    if (userId.contains(user.getId())) {
                        favorite.getUsers().add(user);
                    }
                }
                return "User added";
            }

        }
        return null;
    }


    public String addannouncmenttoFavorite(Long favoriteId, List<Long> announcementId) {
        for (Favorite favorite : DataBase.getFavorites()) {
            if (favorite.getId() == favoriteId) {
                List<Announcement> announcementscopy = new ArrayList<>(DataBase.getAnnouncements());
                for (Announcement announcement : announcementscopy) {
                    if (announcementId.contains(announcement.getId())) {
                        favorite.getAnnouncements().add(announcement);
                    }
                }
                return "Annoucment added";
            }

        }
        return null;
    }

}
