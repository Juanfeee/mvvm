package app.android.mvvm.data.model

class QuoteProvider {
// colamos la informacion desde internet o loca
    companion object{

        fun random(): QuoteModel {
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