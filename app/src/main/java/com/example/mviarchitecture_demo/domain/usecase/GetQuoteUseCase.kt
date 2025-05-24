package com.example.mviarchitecture_demo.domain.usecase

import com.example.mviarchitecture_demo.data.model.Quote
import com.example.mviarchitecture_demo.data.repository.QuoteRepository

class GetQuoteUseCase(private val repository: QuoteRepository) {
    fun execute(): Quote = repository.getRandomQuote()
}
