package app.android.mvvm.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import app.android.mvvm.data.model.QuoteModel
import app.android.mvvm.data.model.QuoteProvider
import app.android.mvvm.domain.GetQuotesUseCase
import app.android.mvvm.domain.GetRandomQuoteUseCase
import kotlinx.coroutines.launch

class QuoteViewModel:ViewModel() {
    val quoteModel= MutableLiveData<QuoteModel>()
    val isLoading =MutableLiveData<Boolean>()
    var getQuotesUseCase= GetQuotesUseCase()
    var getRandomQuoteUseCase= GetRandomQuoteUseCase()

    fun onCreate() {
        viewModelScope.launch {
            isLoading.postValue(true)
            val result = getQuotesUseCase()

            if (!result.isNullOrEmpty()){
                quoteModel.postValue(result[0])
                isLoading.postValue(false)

            }
        }
    }
    fun randomQuote(){
        isLoading.postValue(true)
        val quote=getRandomQuoteUseCase()
        if (quote!=null){
            quoteModel.postValue(quote)
        }
        isLoading.postValue(false)

    }


}