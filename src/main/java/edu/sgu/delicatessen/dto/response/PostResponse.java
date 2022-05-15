package edu.sgu.delicatessen.dto.response;

import edu.sgu.delicatessen.entity.Category;
import edu.sgu.delicatessen.entity.User;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class PostResponse {
    private int postId;
    private String title;
    private String content;
    private String createdAt;
    private Category category;

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
