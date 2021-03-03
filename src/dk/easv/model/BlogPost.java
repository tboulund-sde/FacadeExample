package dk.easv.model;

import java.time.LocalDateTime;

public class BlogPost {
    private LocalDateTime date = LocalDateTime.now();
    private String imagePath;
    private String content;

    public BlogPost(String imagePath, String content) {
        this.imagePath = imagePath;
        this.content = content;
    }

    public String getImagePath() {
        return imagePath;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public String getContent() {
        return content;
    }
}
