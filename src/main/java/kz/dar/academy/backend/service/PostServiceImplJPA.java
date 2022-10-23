package kz.dar.academy.backend.service;

import kz.dar.academy.backend.model.PostRequest;
import kz.dar.academy.backend.model.PostResponse;
import kz.dar.academy.backend.repositoty.PostEntity;
import kz.dar.academy.backend.repositoty.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
    public class PostServiceImplJPA implements PostServiceJPA{

    @Autowired
    PostRepository postRepository;

    @Override
    public PostEntity createPost(PostEntity postEntity) {
        return postRepository.save(postEntity);
    }

    @Override
    public PostEntity updatePost(PostEntity postEntity) {
        return null;
    }

    @Override
    public List<PostEntity> getAllPosts() {
        return postRepository.findAll();
    }

    @Override
    public PostEntity getPostById(Long postId) {
        return postRepository.findById(postId).orElse(null);
    }

    @Override
    public void deletePostById(Long postId) {
        postRepository.deleteById(postId);
    }
}
