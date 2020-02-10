package com.jcarrick.crud_demo

import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api")
class AuthorController (var authorRepository: AuthorRepository) {
  @GetMapping("/authors")
  fun getAuthors(): Iterable<Author> {
    return authorRepository.findAll()
  }

  @PutMapping("/author")
  fun addAuthor(@RequestBody author: Author) {
    authorRepository.save(author)
  }

  @DeleteMapping("/author")
  fun deleteAuthor(@RequestParam id: Long) {
    authorRepository.deleteById(id)
  }
}