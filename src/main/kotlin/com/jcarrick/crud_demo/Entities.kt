package com.jcarrick.crud_demo

import org.hibernate.annotations.CreationTimestamp
import java.sql.Timestamp
import javax.persistence.*

@Entity
@Table(name = "posts")
data class Post(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long?,
    @CreationTimestamp
    @Column(updatable = false)
    var createdAt: Timestamp?,
    @Column
    val author: Long,
    @Column
    var title: String,
    @Column
    var content: String
)

@Entity
@Table(name = "authors")
data class Author(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long,
    @Column(name = "first_name")
    var firstName: String,
    @Column(name = "last_name")
    var lastName: String
)