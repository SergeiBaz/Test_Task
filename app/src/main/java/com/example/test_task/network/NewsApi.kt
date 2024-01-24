package com.example.test_task.network

import com.example.test_task.network.dto.GetResponse

interface NewsApi {
    suspend fun newsSearch(): GetResponse
}