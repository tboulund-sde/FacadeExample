package dk.easv.ui;

import dk.easv.bll.BlogShareFacade;
import dk.easv.model.BlogPost;

// Discuss DRY
public class BlogAdminWindow {

    private BlogShareFacade blogShareFacade = new BlogShareFacade();

    public void createNewPost(BlogPost post) {
        blogShareFacade.share(post.getContent(), post.getImagePath());
    }
}
