package dao.DaoImple;

import dao.FavoriteDao;
import dataBase.DataBase;
import model.Announcement;
import model.Favorite;
import model.User;

import java.util.List;

public class FavoriteDaoImple  implements FavoriteDao {
    @Override
    public String addFavorite(Long userId, Long announcementId) {
        // Ищем пользователя по ID
        User user = DataBase.getUsers().stream()
                .filter(u -> u.getId().equals(userId))
                .findFirst()
                .orElse(null);

        // Ищем объявление по ID
        Announcement announcement = DataBase.getAnnouncements().stream()
                .filter(a -> a.getId()==(announcementId))
                .findFirst()
                .orElse(null);

        // Проверяем, что пользователь и объявление существуют
        if (user != null && announcement != null) {
            // Создаем объект Favorite
            Favorite favorite = new Favorite(userId, announcementId);

            // Добавляем в список избранного
            DataBase.getFavorites().add(favorite);
            return "Favorite added ";
        } else {
            return "User or announcement not found";
        }
    }


    @Override
    public String removeFavorite(Long userId, Long announcementId) {
        Favorite favoriteToRemove = DataBase.getFavorites().stream()
                .filter(f -> f.getUserId().equals(userId) && f.getAnnouncementId().equals(announcementId))
                .findFirst()
                .orElse(null);

        if (favoriteToRemove != null) {
            // Удаляем из списка
            DataBase.getFavorites().remove(favoriteToRemove);
            return "Favorite removed successfully";
        } else {
            return "Favorite not found";
        }    }

    @Override
    public List<Favorite> getallfavorites() {
        return DataBase.getFavorites();
    }
}
