package com.fun.joblisting;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fun.joblisting.Model.Post;
import com.fun.joblisting.Repository.PostRepository;
import com.fun.joblisting.Repository.SearchRepository;

@RestController
public class PostController {


    @Autowired
    PostRepository prepo;

    @Autowired
    SearchRepository srepo;

    @GetMapping("/posts")
    public List<Post> getAllPosts(){

        return prepo.findAll();

    }

    @GetMapping("/posts/{text}")
    public List<Post> search(@PathVariable String text){

        return srepo.findByText(text);

    }


    @PostMapping("/post")
    public Post addPost(@RequestBody Post post){

        return prepo.save(post);
    }


}
