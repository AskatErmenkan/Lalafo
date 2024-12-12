package service.serviceImple;

import dao.FavoriteDao;
import model.Favorite;
import service.FavoriteService;

import java.util.List;

public class FavoriteImpl implements FavoriteService {
    private FavoriteDao favoriteDao;

    public FavoriteImpl(FavoriteDao favoriteDao) {
        this.favoriteDao = favoriteDao;
    }

    @Override
    public String addFavorite(Long userId, Long announcementId) {
       return favoriteDao.addFavorite(userId,announcementId);

    }

    @Override
    public String removeFavorite(Long userId, Long announcementId) {
        return favoriteDao.removeFavorite(userId,announcementId);
    }

    @Override
    public List<Favorite> getallfavorites() {
        return favoriteDao.getallfavorites();
    }
}
