package com.mpco.post.service

import com.mpco.post.model.dto.PostDto
import com.mpco.post.model.entity.Post
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import java.util.*


interface PostService {
    fun readAllPostList(pageable: Pageable?): List<PostDto>

    fun findById(postId: Long): Optional<Post>

    fun save(post: Post): Post?

    fun delete(post: Post?)
}