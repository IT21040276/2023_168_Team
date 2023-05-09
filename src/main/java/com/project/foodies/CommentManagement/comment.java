package com.project.foodies.CommentManagement;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Comment")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Comment_ID")
    private Integer Comment_ID;
    
    @Column(name = "User_ID")
    private Integer User_ID;

    @Column(name = "Post_ID")
    private Integer Post_ID;

    @Column(name = "Text")
    private String Text;

    public Integer getComment_ID() {
        return Comment_ID;
    }

    public void setComment_ID(Integer comment_ID) {
        Comment_ID = comment_ID;
    }

    public Integer getUser_ID() {
        return User_ID;
    }

    public void setUser_ID(Integer user_ID) {
        User_ID = user_ID;
    }

    public Integer getPost_ID() {
        return Post_ID;
    }

    public void setPost_ID(Integer post_ID) {
        Post_ID = post_ID;
    }

    public String getText() {
        return Text;
    }

    public void setText(String text) {
        Text = text;
    }


}