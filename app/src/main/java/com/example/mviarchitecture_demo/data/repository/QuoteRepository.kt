package com.example.mviarchitecture_demo.data.repository

import com.example.mviarchitecture_demo.data.model.Quote

class QuoteRepository {
    fun getRandomQuote(): Quote {
        // Simulate API delay
        Thread.sleep(1000)
        return Quote("Be yourself; everyone else is already taken.", "Oscar Wilde")
    }
}
