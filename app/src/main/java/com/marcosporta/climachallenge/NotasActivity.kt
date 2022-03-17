package com.marcosporta.climachallenge

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class NotasActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notas)

        //Poner boton regresar y titulo en el Action Bar
        supportActionBar?.title = "Notas"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}