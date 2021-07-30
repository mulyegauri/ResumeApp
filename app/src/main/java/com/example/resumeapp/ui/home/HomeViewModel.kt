package com.example.resumeapp.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.resumeapp.model.HomeResponseModel
import com.example.resumeapp.repository.HomeRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(private val repository: HomeRepository) : ViewModel() {
    val myResponse : MutableLiveData<HomeResponseModel> = MutableLiveData()
    fun getHomeResponse(){
        viewModelScope.launch{
            val response : HomeResponseModel = repository.getHomeDetails()
            myResponse.value = response
        }
    }
}

