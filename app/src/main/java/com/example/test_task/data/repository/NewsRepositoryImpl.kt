package com.example.test_task.data.repository

import com.example.test_task.data.model.News
import com.example.test_task.network.NewsApi

class NewsRepositoryImpl(private val api: NewsApi) : NewsRepository {
    override suspend fun getListNews(): List<News> = api.newsSearch().result.list.map { items ->
        News(
            title = items?.title,
            description = items?.description,
            tags = items?.tags,
            url = items?.url,
            time = items?.dateTimestamp,
        )
    }
}