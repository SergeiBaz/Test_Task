package com.example.test_task.presentation.viewModel

import com.example.test_task.data.model.News

sealed interface NewsUiState {
    data class Success(val newsSearch: List<News>) : NewsUiState
    object Error : NewsUiState
    object Loading : NewsUiState
}