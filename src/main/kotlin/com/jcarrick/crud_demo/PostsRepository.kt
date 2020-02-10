package com.jcarrick.crud_demo

import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface PostsRepository : CrudRepository<Post, Long> {
    fun findPostsByAuthor(author: Long): List<Post>
}