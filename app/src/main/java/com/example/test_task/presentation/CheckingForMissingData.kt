package com.example.test_task.presentation

class CheckingForMissingData() {
   companion object {
       fun isNullOrEmpty(value: String?): String {
           return when(value.isNullOrEmpty()) {
               true -> "Details on the website"
               false-> value
           }
       }
   }
}