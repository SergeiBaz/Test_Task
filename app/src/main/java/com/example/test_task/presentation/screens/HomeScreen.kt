package com.example.test_task.presentation.screens

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.test_task.data.model.News
import com.example.test_task.presentation.viewModel.NewsUiState

@Composable
fun HomeScreen(
    newsUiState: NewsUiState,
    retryAction: () -> Unit,
    modifier: Modifier,
    onNewClicked: (News) -> Unit,
) {
    when (newsUiState) {
        is NewsUiState.Loading -> LoadingScreen(modifier)
        is NewsUiState.Success -> NewsGridScreen(
            modifier = modifier,
            onNewClicked,
            news = newsUiState.newsSearch
        )

        is NewsUiState.Error -> ErrorScreen(retryAction = retryAction, modifier)
    }
}