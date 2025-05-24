package com.example.mviarchitecture_demo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.mviarchitecture_demo.data.repository.QuoteRepository
import com.example.mviarchitecture_demo.domain.usecase.GetQuoteUseCase
import com.example.mviarchitecture_demo.ui.theme.MviArchitecture_demoTheme
import com.example.mviarchitecture_demo.ui.view.QuoteScreen
import com.example.mviarchitecture_demo.ui.viewmodel.QuoteViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val repository = QuoteRepository()
        val useCase = GetQuoteUseCase(repository)
        val viewModel = QuoteViewModel(useCase)

        setContent {
            MaterialTheme {
                QuoteScreen(viewModel)
            }
        }
    }
}
