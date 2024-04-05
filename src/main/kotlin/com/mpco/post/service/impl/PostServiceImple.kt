package com.mpco.post.service.impl

import com.mpco.post.model.dto.PostDto
import com.mpco.post.model.entity.Post
import com.mpco.post.repository.PostRepository
import com.mpco.post.service.PostService
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Service
import java.util.*
import kotlin.streams.toList

@Service
class PostServiceImpl(private val postRepository: PostRepository) : PostService {

    override fun readAllPostList(pageable: Pageable?): List<PostDto> {
        val postsPage: Page<Post> = postRepository.findAll(pageable ?: Pageable.unpaged())
        return postsPage.content.map { it.toDto() }
    }

    override fun findById(postId: Long): Optional<Post> {
        return postRepository.findById(postId)
    }

    override fun save(post: Post): Post? {
        return postRepository.save(post)
    }

    override fun delete(post: Post?) {
        post?.let { postRepository.delete(it) }
    }

    private fun Post.toDto(): PostDto {
        return PostDto(id, title, content)
    }
}