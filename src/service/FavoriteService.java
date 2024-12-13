package service;

import model.Favorite;

import java.util.List;

public interface FavoriteService {
    String addFavorite(Favorite favorite); // Добавить в избранное

    String removeFavorite(Long id); // Удалить из избранного
    List<Favorite> getallfavorites();
    String addUserstoFavorite(Long favoriteId, List<Long> userId);
    public String addannouncmenttoFavorite(Long favoriteId, List<Long> announcementId);
    }
