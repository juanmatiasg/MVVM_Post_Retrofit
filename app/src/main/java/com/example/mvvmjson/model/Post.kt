package com.example.mvvmjson.model

import com.google.gson.annotations.SerializedName

data class Post(
    @SerializedName("userId")
    var userId: String,
    @SerializedName("id")
    var id: String,
    @SerializedName("title")
    var title: String,
    @SerializedName("body")
    var body: String

)
