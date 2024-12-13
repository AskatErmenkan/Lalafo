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
    public String addFavorite(Favorite favorite) {
       return favoriteDao.addFavorite(favorite);

    }

    @Override
    public String removeFavorite(Long id) {
        return favoriteDao.removeFavorite(id);
    }

    @Override
    public List<Favorite> getallfavorites() {
        return favoriteDao.getallfavorites();
    }

    @Override
    public String addUserstoFavorite(Long favoriteId, List<Long> userId) {
return  favoriteDao.addUserstoFavorite(favoriteId, userId);
    }

    @Override
    public String addannouncmenttoFavorite(Long favoriteId, List<Long> announcementId) {
    return     favoriteDao.addannouncmenttoFavorite(favoriteId, announcementId);
    }


}
