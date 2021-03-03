package dk.easv.ui;

import dk.easv.bll.ImageManager;
import dk.easv.bll.InstagramManager;
import dk.easv.bll.NotificationManager;
import dk.easv.model.Comment;

// Discuss DRY
public class BlogPostWindow {
    private ImageManager imageManager = new ImageManager();
    private InstagramManager instagramManager = new InstagramManager();
    private NotificationManager notificationManager = new NotificationManager();

    public void addComment(Comment comment) {
        imageManager.cropImage(comment.getPost().getImagePath());
        instagramManager.upload(comment.getComment(), comment.getPost().getImagePath());
        notificationManager.sendMailNotifications(comment.getComment());
        notificationManager.sendAppNotifications(comment.getComment());
    }
}
