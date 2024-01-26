package com.example.test_task.presentation

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.test_task.data.model.News
import com.example.test_task.presentation.screens.HomeScreen
import com.example.test_task.presentation.viewModel.NewsViewModel

@Composable
fun NewsApp(
    modifier: Modifier = Modifier,
    onNewClicked: (News) -> Unit
) {
    val newsViewModel = hiltViewModel<NewsViewModel>()
    newsViewModel.getListNews()
    Scaffold(
        modifier = modifier.fillMaxSize(),
    ) {
        Surface(
            modifier = modifier
                .fillMaxSize()
                .padding(it),
            color = MaterialTheme.colors.background
        ) {
            HomeScreen(
                newsUiState = newsViewModel.newsUiState,
                retryAction = { newsViewModel.getListNews() },
                modifier = modifier,
                onNewClicked
            )
        }
    }
}