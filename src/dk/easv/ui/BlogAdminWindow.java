package dk.easv.ui;

import dk.easv.bll.ImageManager;
import dk.easv.bll.InstagramManager;
import dk.easv.bll.NotificationManager;
import dk.easv.model.BlogPost;

// Discuss DRY
public class BlogAdminWindow {

    private ImageManager imageManager = new ImageManager();
    private InstagramManager instagramManager = new InstagramManager();
    private NotificationManager notificationManager = new NotificationManager();

    public void createNewPost(BlogPost post) {
        imageManager.cropImage(post.getImagePath());
        instagramManager.upload(post.getContent(), post.getImagePath());
        notificationManager.sendMailNotifications(post.getContent());
        notificationManager.sendAppNotifications(post.getContent());
    }
}
