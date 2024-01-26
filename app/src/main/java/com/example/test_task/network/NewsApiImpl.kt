package com.example.test_task.network

import com.example.test_task.network.dto.GetResponse
import io.ktor.client.*
import io.ktor.client.call.body
import io.ktor.client.request.*

class NewsApiImpl (private val client: HttpClient) : NewsApi {
    override suspend fun newsSearch(): GetResponse {
        return client.get(NewsApi.GET_URL).body()
    }
}