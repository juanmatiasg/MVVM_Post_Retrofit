package com.example.mvvmjson.apiservice

import com.example.mvvmjson.model.Post
import retrofit2.http.GET

interface ApiService {
    @GET("/posts")
    suspend fun getPost(): List<Post>
}