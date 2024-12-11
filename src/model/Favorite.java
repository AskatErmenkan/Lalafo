package model;

public class Favorite {
    private Long userId;
    private Long announcementId;

    public Favorite(Long announcementId, Long userId) {
        this.announcementId = announcementId;
        this.userId = userId;
    }

    public Long getUserId() {
        return userId;
    }

    public Long getAnnouncementId() {
        return announcementId;
    }

    @Override
    public String toString() {
        return "Favorite{" +
                "userId=" + userId +
                ", announcementId=" + announcementId +
                '}';
    }
}
