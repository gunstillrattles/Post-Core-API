package kz.dar.academy.backend.repositoty;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<PostEntity, Long> {

    PostEntity getPostEntityByPostId(String postId);
    List<PostEntity> getPostEntitiesBy();
    @Transactional
    void deletePostEntityByPostId(String postId);


}