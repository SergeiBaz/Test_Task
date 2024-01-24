package com.example.test_task.network.dto

import kotlinx.serialization.Serializable

@Serializable
data class GetResponse(
    val retCode: Int?,
    val retMsg: String?,
    val result: Result?
)
