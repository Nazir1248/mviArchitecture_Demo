package com.example.mviarchitecture_demo.ui.intent

sealed class QuoteIntent {
    object LoadQuote : QuoteIntent()
}
