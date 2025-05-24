package com.example.mviarchitecture_demo.ui.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.mviarchitecture_demo.domain.usecase.GetQuoteUseCase
import com.example.mviarchitecture_demo.ui.intent.QuoteIntent
import com.example.mviarchitecture_demo.ui.state.QuoteState
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class QuoteViewModel(private val useCase: GetQuoteUseCase) : ViewModel() {

    var state by mutableStateOf<QuoteState>(QuoteState.Idle)
        private set

    fun onIntent(intent: QuoteIntent) {
        when (intent) {
            is QuoteIntent.LoadQuote -> loadQuote()
        }
    }

    private fun loadQuote() {
        viewModelScope.launch {
            state = QuoteState.Loading
            delay(1000) // Simulate network delay
            try {
                val quote = useCase.execute()
                state = QuoteState.QuoteLoaded(quote)
            } catch (e: Exception) {
                state = QuoteState.Error("Failed to load quote")
            }
        }
    }
}
