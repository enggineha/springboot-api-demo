package org.springboot.api.example.service;

import org.springboot.api.example.model.Post;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

import java.util.List;

public interface JsonPlaceholderApi {

    /**
     * get all post from the fake data call
     * @return
     */
    @GET("/posts")
    Call<List<Post>> getAllPosts();

    /**
     * Get post data as per suserId.
     * @param userId
     * @return
     */
    @GET("/posts")
    Call<List<Post>> getPostsByUserId(@Query("userId") int userId);
}
