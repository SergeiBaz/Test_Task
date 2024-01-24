package com.example.test_task.network.remote.dto

import kotlinx.serialization.Serializable

@Serializable
data class List(
    val title: String?,
    val description: String?,
    val type: Type?,
    val tags: ArrayList<String?>,
    val url: String?,
    val dateTimestamp: Long?,
    val startDateTimestamp: Long?,
    val endDateTimestamp: Long?

)
