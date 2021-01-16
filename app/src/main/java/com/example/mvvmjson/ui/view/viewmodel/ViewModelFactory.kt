package com.example.mvvmjson.ui.view.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.mvvmjson.apiservice.ApiHelper
import com.example.mvvmjson.repository.MainActivityRepository

class ViewModelFactory(private val apiHelper: ApiHelper) : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MainViewModel::class.java)) {
            return MainViewModel(MainActivityRepository(apiHelper)) as T
        }
        throw IllegalArgumentException("Unknown class name")
    }

}