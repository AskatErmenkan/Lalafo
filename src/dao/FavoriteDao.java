package dao;

import model.Favorite;

import java.util.List;

public interface FavoriteDao {
    String addFavorite(Favorite favorite); // Добавить в избранное
    String removeFavorite(Long id);
    List<Favorite> getallfavorites();
    String addUserstoFavorite(Long favoriteId, List<Long> userId);
    public String addannouncmenttoFavorite(Long favoriteId, List<Long> announcementId);
}
