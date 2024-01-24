package com.example.test_task.network.remote.dto

import kotlinx.serialization.Serializable

@Serializable
data class Result(
    val total: Int?,
    val list: ArrayList<List?>,
)
