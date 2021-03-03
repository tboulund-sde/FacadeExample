package dk.easv;

import dk.easv.model.BlogPost;
import dk.easv.model.Comment;
import dk.easv.ui.BlogAdminWindow;
import dk.easv.ui.BlogPostWindow;

public class Main {

    private static BlogAdminWindow blogAdminWindow = new BlogAdminWindow();
    private static BlogPostWindow blogPostWindow = new BlogPostWindow();

    public static void main(String[] args) {
        BlogPost post = new BlogPost("/Users/Desktop/my-little-kitty.jpg", "Isn't he just adorable");
        blogAdminWindow.createNewPost(post);

        Comment comment = new Comment("catlover87", "Awww! The cutest thing I have ever seen!!! <3", post);
        blogPostWindow.addComment(comment);
    }
}
