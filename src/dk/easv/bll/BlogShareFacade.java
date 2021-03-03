package dk.easv.bll;

public class BlogShareFacade {
    private ImageManager imageManager = new ImageManager();
    private InstagramManager instagramManager = new InstagramManager();
    private NotificationManager notificationManager = new NotificationManager();

    public void share(String message, String imagePath) {
        imageManager.cropImage(imagePath);
        instagramManager.upload(message, imagePath);
        notificationManager.sendMailNotifications(message);
        notificationManager.sendAppNotifications(message);
    }
}
