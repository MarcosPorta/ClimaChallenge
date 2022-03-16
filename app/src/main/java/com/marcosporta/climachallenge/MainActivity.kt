package com.marcosporta.climachallenge

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    //Tratamiento del login
    fun clickLogin(view: View){

        val intent= Intent(this,HomePage::class.java)
        startActivity(intent)
    }

}