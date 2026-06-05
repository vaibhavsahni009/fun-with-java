package com.fun.joblisting.Repository;

import java.util.List;

import com.fun.joblisting.Model.Post;

public interface SearchRepository {
    

    public List<Post> findByText(String text);
}
