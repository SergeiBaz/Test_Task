package com.example.test_task.network.remote

object ConstantsNetwork {
    private const val BASE_URL = "https://api.bybit.com/v5/announcements/"
    const val GET_URL = "$BASE_URL/index?locale=en-US&limit=10"
}