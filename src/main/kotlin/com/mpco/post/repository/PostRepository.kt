package com.mpco.post.repository

import com.mpco.post.model.entity.Post
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface PostRepository : JpaRepository<Post, Long> {
    override fun findById(postId: Long): Optional<Post>
    override fun delete(post: Post)
}