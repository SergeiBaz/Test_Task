package com.example.test_task.data.model

import java.text.SimpleDateFormat
import java.util.Date

data class News(
    val title: String?,
    val description: String?,
    val tags: ArrayList<String>?,
    val url: String?,
    val time: Long?
) {
    fun convertLongToTime(time: Long): String {
        val date = Date(time)
        val format = SimpleDateFormat("MMM dd, yyyy") //"M dd, yyyy"
        return format.format(date)
    }
}
