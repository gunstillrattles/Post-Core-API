package kz.dar.academy.backend.service;

import kz.dar.academy.backend.model.PostModel;
import java.util.List;

public interface PostService {
    void createPost(PostModel postModel);
    List<PostModel> getAllPosts();
    PostModel getPostById(String postId);
    void updatePostById(String postId, PostModel postModel);
    void deletePostById(String postId);
}
