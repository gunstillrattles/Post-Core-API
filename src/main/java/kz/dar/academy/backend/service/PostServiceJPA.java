package kz.dar.academy.backend.service;

import kz.dar.academy.backend.model.PostRequest;
import kz.dar.academy.backend.model.PostResponse;
import kz.dar.academy.backend.repositoty.PostEntity;

import java.util.List;

public interface PostServiceJPA {
    PostEntity createPost(PostEntity postEntity);
    PostEntity updatePost(PostEntity postEntity);
    List<PostEntity> getAllPosts();
    PostEntity getPostById(Long id);
    void deletePostById(Long postId);
}