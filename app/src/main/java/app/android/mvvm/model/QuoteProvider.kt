package app.android.mvvm.model

class QuoteProvider {

    companion object{

        fun random():QuoteModel{
            var position= (0..4).random()
            return quote[position]
        }

        private val quote = listOf<QuoteModel>(
            QuoteModel("Cita1","Autor1"),
            QuoteModel("Cita2","Autor2"),
            QuoteModel("Cita3","Autor3"),
            QuoteModel("Cita4","Autor6"),
            QuoteModel("Cita5","Autor5"),
        )
    }

}