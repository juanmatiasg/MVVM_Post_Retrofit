package com.example.mvvmjson.ui.view.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.example.mvvmjson.repository.MainActivityRepository
import com.example.mvvmjson.utils.Resource
import kotlinx.coroutines.Dispatchers


class MainViewModel(private val mainRepository: MainActivityRepository) : ViewModel() {

    fun getPost() = liveData(Dispatchers.IO) {
        emit(Resource.loading(data = null))

        try {
            emit(Resource.success(data = mainRepository.getPost()))
        }
        catch (e:Exception){
            emit(Resource.error(data = null,message = e.message ?: "Error Ocurred"))
        }
    }

}