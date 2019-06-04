package com.consulteer.facebook.controller;


import com.consulteer.facebook.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController

@RequestMapping("/posts")
public class PostController {
    @Autowired
    private PostService postService;

    @PutMapping("/{id}/like")
    public Integer likePost(@PathVariable("id") Long id) {
        return postService.likePost(id);

//    @PostMapping("/postId/like")
//            public String likedPost(@PathVariable ("postLikedId") Long postLikedId) {
//        return postService.likedPost(id);
//
//
//        }

    }

}
