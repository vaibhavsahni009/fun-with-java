package com.fun.joblisting.Repository;

import com.fun.joblisting.Model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<Post, String> {

}
