package com.geekster.restaurantModel.controller;

import com.geekster.restaurantModel.entity.Post;
import com.geekster.restaurantModel.services.PostsService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PostController {
@RequestMapping("/posts")
    public List<Post> getPosts(){
        return new PostsService().getPosts();
    }
    @RequestMapping("/posts/{id}")
    public Post getPost(@PathVariable("id")int id){
    return  new PostsService().getPost(id);
    }


    @RequestMapping(method = RequestMethod.POST,value = "/posts")
    public void addPost(@RequestBody Post listElement){
     new PostsService().addPost(listElement);
    }

    @RequestMapping(method = RequestMethod.PUT,value = "/posts/{id}")
    public void updatePost(Post posts,int id){
    new PostsService().updatePost(posts,id);
    }

    @RequestMapping(method = RequestMethod.DELETE,value = "/posts/{id}")
  public void  deletePost(Post posts,int id){
        new PostsService().deletePost(posts,id);
    }


}
