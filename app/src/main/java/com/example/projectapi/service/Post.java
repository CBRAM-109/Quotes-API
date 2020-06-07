package com.example.projectapi.service;

import com.google.gson.annotations.SerializedName;

public class Post {
    private int id;
    private String author;

    @SerializedName("body")
    private String text;

    public int getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }

    public String getText() {
        return text;
    }
}
