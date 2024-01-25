package com.example.test_task.network.dto

import kotlinx.serialization.Serializable

@Serializable
data class GetResponse(
    val retCode: Int? = null,
    val retMsg: String? = null,
    var result: Result = Result(),
)
