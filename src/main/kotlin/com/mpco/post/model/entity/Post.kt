package com.mpco.post.model.entity

import  jakarta.persistence.Entity
import  jakarta.persistence.GeneratedValue
import  jakarta.persistence.GenerationType
import  jakarta.persistence.Id

@Entity
data class Post(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long? = null,
        val title: String,
        val content: String
)