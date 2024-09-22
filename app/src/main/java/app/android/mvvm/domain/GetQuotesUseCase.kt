package app.android.mvvm.domain

import app.android.mvvm.QuoteRepository
import app.android.mvvm.data.model.QuoteModel

class GetQuotesUseCase {

    private val repository = QuoteRepository()

    suspend operator fun invoke():List<QuoteModel>?{

        return repository.getAllQuotes()
    }
}