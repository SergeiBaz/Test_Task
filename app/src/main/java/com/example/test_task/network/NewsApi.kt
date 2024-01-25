package com.example.test_task.network

import com.example.test_task.network.dto.GetResponse

interface NewsApi {
    companion object {
        private const val BASE_URL = "https://api.bybit.com/v5/announcements/"
        const val GET_URL = "$BASE_URL/index?locale=en-US&limit=10"
    }

    suspend fun newsSearch(): GetResponse
}