package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Iniciar_sesion : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setContentView(R.layout.activity_iniciar_sesion)
        val registrarModuloCitas = findViewById<TextView>(R.id.buttonIngresar)

        registrarModuloCitas.setOnClickListener {
            val modulo_citas = Intent(this, DosMitades::class.java)
            startActivity(modulo_citas)
        }
    }
}