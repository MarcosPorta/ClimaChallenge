package com.marcosporta.climachallenge

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class HomePage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)
    }

    fun clickClima(view: View){
        val intent= Intent(this,ClimaActivity::class.java)
        startActivity(intent)
    }

    fun clickNotas(view: View){
        val intent= Intent(this,NotasActivity::class.java)
        startActivity(intent)
    }

}