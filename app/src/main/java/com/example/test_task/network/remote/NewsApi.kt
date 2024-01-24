package com.example.test_task.network

import com.example.test_task.network.remote.dto.GetResponse

interface NewsApi {
    suspend fun getListNews(): GetResponse
}