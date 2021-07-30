package com.example.resumeapp.repository

import com.example.resumeapp.api.HomeApi
import com.example.resumeapp.api.RetrofitInstance
import com.example.resumeapp.model.HomeResponseModel

class HomeRepository{
    suspend fun getHomeDetails(): HomeResponseModel {
        return RetrofitInstance.api.getHomeDetails()
    }
}