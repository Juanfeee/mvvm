package app.android.mvvm.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import app.android.mvvm.model.QuoteModel
import app.android.mvvm.model.QuoteProvider

class QuoteViewModel:ViewModel() {
    val quoteModel= MutableLiveData<QuoteModel>()


    fun randomQuote(){
        val currentQuote:QuoteModel =QuoteProvider.random()
        quoteModel.postValue(currentQuote)
    }
}