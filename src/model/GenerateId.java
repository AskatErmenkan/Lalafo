package model;

public class GenerateId {
    public  static Long userId=0L;
    public static Long userId(){
        return ++userId;
    }
    public  static Long announcementId=0L;
    public static Long announcementId(){
        return ++announcementId;
    }
    public  static Long favoriteId=0L;
    public static Long favoriteId(){
        return ++favoriteId;
    }


}
