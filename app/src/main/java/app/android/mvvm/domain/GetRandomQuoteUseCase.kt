package app.android.mvvm.domain

import app.android.mvvm.QuoteRepository
import app.android.mvvm.data.model.QuoteModel
import app.android.mvvm.data.model.QuoteProvider

class GetRandomQuoteUseCase {

    private var repository= QuoteRepository()

    operator fun invoke():QuoteModel?{
        val quotes:List<QuoteModel> = QuoteProvider.quotes
        if (!quotes.isNullOrEmpty()){
            val randomNumber:Int =(0..quotes.size-1).random()
            return quotes[randomNumber]
        }
        return null
    }
}