package dao;

import model.Favorite;

import java.util.List;

public interface FavoriteDao {
    String addFavorite(Long userId, Long announcementId); // Добавить в избранное
    String removeFavorite(Long userId, Long announcementId);
    List<Favorite> getallfavorites();// Удалить из избранного
}
