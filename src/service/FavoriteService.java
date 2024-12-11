package service;

import model.Favorite;

import java.util.List;

public interface FavoriteService {
    String addFavorite(Long userId, Long announcementId); // Добавить в избранное

    String removeFavorite(Long userId, Long announcementId); // Удалить из избранного
    List<Favorite> getallfavorites();
}
