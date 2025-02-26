package br.com.cooltech.controller

import br.com.cooltech.model.Post
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.responses.ApiResponse
import io.swagger.v3.oas.annotations.responses.ApiResponses
import io.swagger.v3.oas.annotations.media.Content
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import br.com.cooltech.service.PostService

@RestController
@RequestMapping("/api/post")
class PostController(private val postService:PostService) {
    @Operation(summary = "Register a new user", description = "Creates a new user account with encrypted password")
    @ApiResponses(
        value = [
            ApiResponse(responseCode = "200", description = "User registered successfully"),
            ApiResponse(responseCode = "400", description = "User with this email already exists", content = [Content()])
        ])

    @PostMapping("/save")
        fun save(@RequestBody post: Post):String{
            return postService.save(post)
    }
}