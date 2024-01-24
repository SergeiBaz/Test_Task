package com.example.test_task.network.remote.dto

import kotlinx.serialization.Serializable

@Serializable
data class Type(
    val title: String?,
    val key: String?
)
