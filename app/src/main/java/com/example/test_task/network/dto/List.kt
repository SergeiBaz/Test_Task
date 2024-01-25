package com.example.test_task.network.dto

import kotlinx.serialization.Serializable

@Serializable
data class List(
    val title: String? = null,
    val description: String? = null,
    val type: Type? = Type(),
    val tags: ArrayList<String>? = arrayListOf(),
    val url: String? = null,
    val dateTimestamp: Long? = null,
    val startDateTimestamp: Long? = null,
    val endDateTimestamp: Long? = null

)
