package com.example.telegraph.service;

import com.example.telegraph.Repository.PostRepository;
import com.example.telegraph.entity.PostEntity;
import com.example.telegraph.entity.UserEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PostService {
    private final PostRepository postRepository;
public PostEntity addPost(String title, String Author , UserEntity owner){
    PostEntity post = PostEntity.builder().author(Author)
            .owner(owner)
            .Title(title)
    .build();
    PostEntity save = postRepository.save(post);
    return save;
}
public 

}
