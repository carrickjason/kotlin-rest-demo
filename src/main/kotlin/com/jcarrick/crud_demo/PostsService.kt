package com.jcarrick.crud_demo

import org.springframework.stereotype.Service

@Service
class PostsService(var postsRepository: PostsRepository) {
  fun getPosts(): Iterable<Post> {
    return postsRepository.findAll()
  }

  fun getPostsByAuthor(author: Long): Iterable<Post> {
    return postsRepository.findPostsByAuthor(author)
  }

  fun createOrUpdatePost(post: Post) {
    // Should I be checking for duplicates with the id?
    postsRepository.save(post)
  }

  fun deletePost(id: Long) {
    postsRepository.deleteById(id)
  }
}