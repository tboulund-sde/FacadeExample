package dk.easv.ui;

import dk.easv.bll.BlogShareFacade;
import dk.easv.model.Comment;

// Discuss DRY
public class BlogPostWindow {
    private BlogShareFacade blogShareFacade = new BlogShareFacade();

    public void addComment(Comment comment) {
        blogShareFacade.share(comment.getComment(), comment.getPost().getImagePath());
    }
}
