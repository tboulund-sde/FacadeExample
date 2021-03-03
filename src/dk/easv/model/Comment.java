package dk.easv.model;

import java.time.LocalDateTime;

public class Comment {
    private String author;
    private LocalDateTime date = LocalDateTime.now();
    private String comment;
    private BlogPost post;

    public Comment(String author, String comment, BlogPost post) {
        this.author = author;
        this.comment = comment;
        this.post = post;
    }

    public String getAuthor() {
        return author;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public String getComment() {
        return comment;
    }

    public BlogPost getPost() {
        return post;
    }
}
