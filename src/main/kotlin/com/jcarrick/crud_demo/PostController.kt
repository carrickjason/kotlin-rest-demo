package com.jcarrick.crud_demo

import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api")
data class PostController(private val postsService: PostsService) {
    @GetMapping("/posts")
    fun posts(@RequestParam author: Long?): Iterable<Post> {
        return if (author != null) {
            postsService.getPostsByAuthor(author)
        } else {
            postsService.getPosts()
        }
    }

    @PutMapping("/post")
    fun savePost(@RequestBody post: Post) {
        postsService.createOrUpdatePost(post)
    }

    @PostMapping("/post")
    fun editPost(@RequestBody post: Post) {
        postsService.createOrUpdatePost(post)
    }

    @DeleteMapping("/post")
    fun deletePost(@RequestParam id: Long) {
        postsService.deletePost(id)
    }
}
