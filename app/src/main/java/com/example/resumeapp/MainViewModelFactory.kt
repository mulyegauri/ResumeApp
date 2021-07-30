package com.example.resumeapp

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.resumeapp.repository.HomeRepository
import com.example.resumeapp.ui.home.HomeViewModel
import javax.inject.Inject

class MainViewModelFactory @Inject constructor(private val repository: HomeRepository) : ViewModelProvider.Factory{
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return HomeViewModel(repository) as T
    }
}