package com.mpco.post.controller

import com.mpco.post.model.dto.PostDto
import com.mpco.post.service.PostService
import org.springframework.data.domain.Pageable
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
class PostController(private val postService: PostService) {
    // Controller 에서 Dto<->Entity 전환
    // DtoWrapper? ResponseEntity? 로 감싸서 response

    @GetMapping("/posts")
    fun getPostList(@RequestParam paramMap: HashMap<String?, String?>?, pageable: Pageable?): ResponseEntity<List<PostDto>> {
        val posts: List<PostDto> = postService.readAllPostList(pageable)
        return ResponseEntity.ok(posts) // "get post list success." 메시지는 로깅으로 처리하는 것이 좋음
    }

}