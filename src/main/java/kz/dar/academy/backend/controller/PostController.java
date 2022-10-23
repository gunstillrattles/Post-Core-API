package kz.dar.academy.backend.controller;

import kz.dar.academy.backend.model.PostModel;
import kz.dar.academy.backend.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/post")
public class PostController {
    @Autowired
    Environment env;

    @Autowired
    private PostService postService;

    @GetMapping("/check")
    public String check() {
        return "post-core-api is working at " + env.getProperty("local.server.port");
    }

    @PostMapping
    public ResponseEntity<String> createPost(@Valid @RequestBody PostModel postModel){
        postService.createPost(postModel);
        return new ResponseEntity<String>("Successfully created", HttpStatus.OK);
    }

    @GetMapping("/all")
    public List<PostModel> getAllPosts() {
        return postService.getAllPosts();
    }

    @GetMapping("/{postId}")
    public PostModel getPostById(@PathVariable String postId) {
        return postService.getPostById(postId);
    }

    @PutMapping("/{postId}")
    public ResponseEntity<String> updatePost(@PathVariable String postId,
                                             @Valid @RequestBody PostModel postModel) {
        postService.updatePostById(postId, postModel);
        return new ResponseEntity<String>("Successfully updated", HttpStatus.OK);
    }

    @DeleteMapping("/{userId}")
    public ResponseEntity<String> deletePostById(@PathVariable("userId") String postId) {
        postService.deletePostById(postId);
        return new ResponseEntity<String>("Successfully deleted", HttpStatus.OK);
    }
}