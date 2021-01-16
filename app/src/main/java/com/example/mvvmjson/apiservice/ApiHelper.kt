package com.example.mvvmjson.apiservice

class ApiHelper(private val apiService: ApiService) {

    suspend fun getUsers() = apiService.getPost()
}