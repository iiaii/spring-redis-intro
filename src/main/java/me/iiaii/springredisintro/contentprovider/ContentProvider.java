package me.iiaii.springredisintro.contentprovider;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.redis.core.index.Indexed;

@RedisHash("ContentProvider")
public class ContentProvider {

    @Id
    private String id;

    @Indexed
    private String title;

    private String image;

    private String homepage;

    public ContentProvider(String title, String image, String homepage) {
        this.title = title;
        this.image = image;
        this.homepage = homepage;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getHomepage() {
        return homepage;
    }

    public void setHomepage(String homepage) {
        this.homepage = homepage;
    }

    @Override
    public String toString() {
        return "ContentProvider{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", image='" + image + '\'' +
                ", homepage='" + homepage + '\'' +
                '}';
    }
}
