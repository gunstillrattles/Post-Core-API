package kz.dar.academy.backend.controller;

import kz.dar.academy.backend.repositoty.PostEntity;
import kz.dar.academy.backend.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/post")

public class PostControllerJPA {

    @Autowired
    private PostService postService;

    @PostMapping
    public PostEntity createPost(@RequestBody PostEntity postEntity){
        return postService.createPost(postEntity);
    }

    @PutMapping
    public PostEntity updatePost(@RequestParam String postId, @RequestBody PostEntity postEntity){
        postEntity.setPostId(postId);
        return null;
    }

    @GetMapping
    public PostEntity getPostById(@RequestParam Long postId){
        return postService.getPostById(postId);
    }
}