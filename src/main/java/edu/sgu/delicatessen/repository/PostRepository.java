package edu.sgu.delicatessen.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.sgu.delicatessen.entity.Post;

public interface PostRepository extends JpaRepository<Post,Integer> {
    List<Post> findByCategory_CategoryId(Integer categoryId);
}
