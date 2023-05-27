package com.example.telegraph.Repository;

import com.example.telegraph.entity.PostEntity;
import com.example.telegraph.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
@Repository
public interface PostRepository extends JpaRepository<PostEntity, UUID> {

    Optional<List<PostEntity>> searchByAuthorContainingIgnoreCaseOrTitleContainingIgnoreCaseOrderByCreatedDateAsc(String searchWord);
    Optional<List<PostEntity>>searchByOwner(UserEntity user);

}
