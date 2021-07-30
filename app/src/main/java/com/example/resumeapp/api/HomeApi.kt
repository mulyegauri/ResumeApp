package com.example.resumeapp.api

import com.example.resumeapp.model.HomeResponseModel

interface HomeApi {
    suspend fun getHomeDetails(): HomeResponseModel
}