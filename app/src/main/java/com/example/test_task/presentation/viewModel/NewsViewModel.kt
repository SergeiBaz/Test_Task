package com.example.test_task.presentation.viewModel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.test_task.data.repository.NewsRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject
@HiltViewModel
class NewsViewModel @Inject constructor(
    private val repository: NewsRepository
) : ViewModel() {

    var newsUiState: NewsUiState by mutableStateOf(NewsUiState.Loading)
        private set


    fun getListNews() {
        viewModelScope.launch {
            newsUiState = NewsUiState.Loading
            newsUiState =
                try {
                    NewsUiState.Success(repository.getListNews())
                } catch (e: java.io.IOException) {
                    NewsUiState.Error
                } catch (e: io.ktor.utils.io.errors.IOException) {
                    NewsUiState.Error
                }
        }
    }
}