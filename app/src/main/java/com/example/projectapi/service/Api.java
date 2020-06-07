package com.example.projectapi.service;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {
    @GET ("/api/qotd")
    Call<List<Post>> getPosts();

}
