package com.geekster.restaurantModel.services;

import com.geekster.restaurantModel.entity.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostsService<posts> {
    List<Post>posts = new ArrayList<>();
    public PostsService(){
        posts.add(new Post(1,"Geekster Restaurant","Special Thali","Prayagraj",
                843316675,15,250));
        posts.add(new Post(2,"Geekster Restaurant","Chokha Bati","Prayagraj",
                843316675,15,120));
        posts.add(new Post(3,"Geekster Restaurant","Paneer Special","Prayagraj",
                843316675,15,350));
        posts.add(new Post(4,"Geekster Restaurant","Punjabi Special","Prayagraj",
                843316675,15,375));
        posts.add(new Post(5,"Geekster Restaurant","Special Masala Dhosa","Prayagraj",
                843316675,15,385));
    }

    public List<Post> getPosts() {
        return posts;
    }
    public Post getPost(int id) {
        // TODO Auto-generated method stub
        for(Post post: posts) {
            if(post.getId() == id) {
                return post;
            }
        }
        return null;
    }

    public void addPost(Post listElement){
        posts.add(listElement);
    }

    public void updatePost(Post post,int id){
        for (int i = 0; i<posts.size();i++){
            Post tempPost = posts.get(i);

            if (tempPost.getId()==id){
                posts.set(i,post);
                return;
            }
        }
    }

    public void deletePost(Post posts, int id){
        for (int i = 0; i < this.posts.size(); i++){
            Post tempPost = this.posts.get(i);

            if (tempPost.getId()==id){
                this.posts.remove(i);
                return;
            }
        }
    }


}
