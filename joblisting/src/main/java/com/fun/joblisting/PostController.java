package com.fun.joblisting;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fun.joblisting.Model.Post;

// GET "/" is handled by springdoc-openapi via springdoc.swagger-ui.path=/ in application.properties
// SpringDoc registers its own SwaggerWelcomeWebMvc handler at "/" which redirects to Swagger UI
@RestController
public class PostController {


    @Autowired
    PostRepository prepo;

    @GetMapping("/posts")
    public List<Post> getAllPosts(){

        return prepo.findAll();

    }

    @PostMapping("/post")
    public Post addPost(@RequestBody Post post){

        return prepo.save(post);
    }


}
