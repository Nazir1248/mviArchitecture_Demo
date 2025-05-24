package com.example.mviarchitecture_demo.ui.state

import com.example.mviarchitecture_demo.data.model.Quote

sealed class QuoteState {
    object Idle : QuoteState()
    object Loading : QuoteState()
    data class QuoteLoaded(val quote: Quote) : QuoteState()
    data class Error(val message: String) : QuoteState()
}
