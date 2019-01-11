package com.example.anes.clase2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_evento.*
import kotlinx.android.synthetic.main.activity_main.*

class Evento : AppCompatActivity() {

    var contador:Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_evento)

        boton1.setOnLongClickListener{
            Toast.makeText(this@Evento, "Funciono tu click", Toast.LENGTH_SHORT).show()
            true
        }
    }

    fun sumaContador(view: View){
        contador++
        mostrarResultado(view)
    }

    fun restaContador(view: View){
        contador--
        mostrarResultado(view)
    }

    fun mostrarResultado(view: View){
        var resultado =findViewById(R.id.textView) as TextView
        resultado.setText("Contador: $contador")
    }
}
