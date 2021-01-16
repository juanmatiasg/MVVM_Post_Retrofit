package com.example.mvvmjson.repository

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.example.mvvmjson.apiservice.ApiHelper
import com.example.mvvmjson.model.Post
import com.example.mvvmjson.retrofit.RetrofitClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivityRepository(private val apiHelper: ApiHelper) {
    suspend fun getPost() = apiHelper.getUsers()
}