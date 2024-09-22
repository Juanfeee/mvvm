package app.android.mvvm

import app.android.mvvm.data.model.QuoteModel
import app.android.mvvm.data.model.QuoteProvider
import app.android.mvvm.data.network.QuoteService

class QuoteRepository {

    private val api = QuoteService()

    suspend fun getAllQuotes():List<QuoteModel>{
        val response = api.getQuotes()
        QuoteProvider.quotes = response
        return response
    }
}