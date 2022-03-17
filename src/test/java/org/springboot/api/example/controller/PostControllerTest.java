package org.springboot.api.example.controller;

import org.junit.Before;
import org.junit.Test;
import org.springboot.api.example.model.Post;
import org.springboot.api.example.service.JsonPlaceholderService;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class PostControllerTest {
    private static final int USER_ID = 1;

    private PostController controller;

    private JsonPlaceholderService jsonPlaceholderService;

    @Before
    public void before() {
        jsonPlaceholderService = mock(JsonPlaceholderService.class);
        controller = new PostController(jsonPlaceholderService);
    }

    @Test
    public void shouldTestPost() throws Exception {
        List<Post> posts = new ArrayList<>();
        posts.add(createPost(USER_ID, 1, "Title 1"));
        posts.add(createPost(USER_ID, 2, "Title 2"));
        posts.add(createPost(USER_ID, 3, "Title 3"));
        Future<List<Post>> futurePosts = new TestFuture<>(posts);
        when(jsonPlaceholderService.getPostsByUserId(USER_ID)).thenReturn(futurePosts);
    }



    private Post createPost(int userId, int id, String title) {
        Post post = new Post();
        post.setUserId(userId);
        post.setId(id);
        post.setTitle(title);
        return post;
    }
}
