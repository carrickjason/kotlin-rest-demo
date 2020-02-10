package com.jcarrick.crud_demo

import org.springframework.data.repository.CrudRepository

interface AuthorRepository : CrudRepository<Author, Long> {
}