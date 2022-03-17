package com.marcosporta.climachallenge

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ClimaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_clima)

        //Poner boton regresar y titulo en el Action Bar
        supportActionBar?.title = "Clima"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}