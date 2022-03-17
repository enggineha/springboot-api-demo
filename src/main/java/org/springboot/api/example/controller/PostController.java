package org.springboot.api.example.controller;


import org.springboot.api.example.model.Post;
import org.springboot.api.example.service.JsonPlaceholderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.MediaType;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

@RestController
@ComponentScan(basePackages = "org.springboot.api.example.service")
public class PostController {

    private final JsonPlaceholderService jsonPlaceholderService;

    @Autowired
    public PostController(JsonPlaceholderService jsonPlaceholderService) {
        this.jsonPlaceholderService = jsonPlaceholderService;
    }

    /**
     * To get all the value from posts
     * @return
     * @throws IOException
     * @throws InterruptedException
     * @throws ExecutionException
     */
    @RequestMapping(value = "/post", method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_VALUE)
    public List<Post> get()
            throws IOException, InterruptedException, ExecutionException {
        Future<List<Post>> futurePosts = jsonPlaceholderService.getAllPosts();
        List<Post> posts = futurePosts.get();
        return posts;
    }

    /**
     * get only 1 list as per user Id
     * @param userId
     * @param name
     * @param model
     * @return
     * @throws IOException
     * @throws InterruptedException
     * @throws ExecutionException
     */
    @RequestMapping(value = "/post/{userId}", method = RequestMethod.GET)
    public List<Post> get(@PathVariable("userId") int userId, String name, Model model)
            throws IOException, InterruptedException, ExecutionException {
        Future<List<Post>> futurePosts = jsonPlaceholderService.getPostsByUserId(userId);
        List<Post> posts = futurePosts.get();
        model.addAttribute("post", posts);
        return posts;
    }
}
