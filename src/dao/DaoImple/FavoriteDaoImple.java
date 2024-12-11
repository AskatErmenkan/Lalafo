package dao.DaoImple;

import dao.FavoriteDao;
import dataBase.DataBase;
import model.Favorite;
import model.User;

import java.util.List;

public class FavoriteDaoImple  implements FavoriteDao {
    @Override
    public String addFavorite(Long userId, Long announcementId) {

        return "";
    }

    @Override
    public String removeFavorite(Long userId, Long announcementId) {
        return "";
    }

    @Override
    public List<Favorite> getallfavorites() {
        return DataBase.getFavorites();
    }
}
