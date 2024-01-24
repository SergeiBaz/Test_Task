package com.example.test_task.data.repository

import com.example.test_task.data.model.News

interface NewsRepository {
    suspend fun getListNews(): List<News>
}