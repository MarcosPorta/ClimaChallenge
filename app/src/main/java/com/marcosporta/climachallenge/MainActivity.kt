package com.marcosporta.climachallenge

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var usuarioTV: EditText
    lateinit var passwordTV: EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    //Tratamiento del login
    fun clickLogin(view: View){
        usuarioTV = findViewById(R.id.etUsuario)
        passwordTV = findViewById(R.id.etPassword)
        println("MIRAR ACA --------> $usuarioTV")
        val intent= Intent(this,HomePage::class.java)
        startActivity(intent)
    }

}