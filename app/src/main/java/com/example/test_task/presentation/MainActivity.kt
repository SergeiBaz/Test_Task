package com.example.test_task.presentation

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.core.content.ContextCompat
import com.example.test_task.presentation.ui.theme.Test_TaskTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Test_TaskTheme {
                NewsApp(
                    onNewClicked = {
                        ContextCompat.startActivity(
                            this,
                            Intent(Intent.ACTION_VIEW, Uri.parse(it.url)),
                            null
                        )
                    }
                )
            }
        }
    }
}