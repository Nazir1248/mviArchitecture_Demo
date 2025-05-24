package com.example.mviarchitecture_demo.ui.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.mviarchitecture_demo.ui.intent.QuoteIntent
import com.example.mviarchitecture_demo.ui.state.QuoteState
import com.example.mviarchitecture_demo.ui.viewmodel.QuoteViewModel

@Composable
fun QuoteScreen(viewModel: QuoteViewModel) {
    val state = viewModel.state

    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        when (state) {
            is QuoteState.Idle -> Text("Tap to get a quote")
            is QuoteState.Loading -> CircularProgressIndicator()
            is QuoteState.QuoteLoaded -> {
                Text("\"${state.quote.text}\"", style = MaterialTheme.typography.bodyLarge)
                Text("- ${state.quote.author}", style = MaterialTheme.typography.bodySmall)
            }
            is QuoteState.Error -> Text("Error: ${state.message}")
        }

        Spacer(modifier = Modifier.height(24.dp))
        Button(onClick = { viewModel.onIntent(QuoteIntent.LoadQuote) }) {
            Text("Get Quote")
        }
    }
}
