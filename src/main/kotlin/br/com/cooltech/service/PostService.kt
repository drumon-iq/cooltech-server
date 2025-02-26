package br.com.cooltech.service

import br.com.cooltech.model.Post
import br.com.cooltech.repository.PostRepository
import org.springframework.stereotype.Service

@Service
class PostService(
    private val postRepository:PostRepository
) {
    fun save(post:Post):String {
        return postRepository.save(post).toString()
    }
}