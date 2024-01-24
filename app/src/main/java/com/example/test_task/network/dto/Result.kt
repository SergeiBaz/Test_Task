package com.example.test_task.network.dto

import kotlinx.serialization.Serializable

@Serializable
data class Result(
    val total: Int?,
    val list: ArrayList<List?>,
)
