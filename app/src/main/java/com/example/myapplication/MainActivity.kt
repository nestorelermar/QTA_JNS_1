package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inicio)

        val registrarModuloCitas = findViewById<TextView>(R.id.button)

        registrarModuloCitas.setOnClickListener {
            val modulo_citas = Intent(this, Iniciar_sesion::class.java)
            startActivity(modulo_citas)
        }
    }
}