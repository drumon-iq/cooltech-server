package br.com.cooltech.repository

import br.com.cooltech.model.Post
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface PostRepository: MongoRepository<Post, String> {

}

