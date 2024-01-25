package com.example.test_task.network.dto

import kotlinx.serialization.Serializable

@Serializable
data class Type(
    val title: String? = null,
    val key: String? = null
)
