package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DosMitades : AppCompatActivity() {

    private lateinit var inputEditText: EditText
    private lateinit var resultTextView: TextView
    private lateinit var submitButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dos_mitades)

        // Inicializamos las vistas
        inputEditText = findViewById(R.id.inputEditText)
        resultTextView = findViewById(R.id.resultTextView)
        submitButton = findViewById(R.id.button)

        // Configuramos el listener del botón
        submitButton.setOnClickListener {
            val input = inputEditText.text.toString()
            val result = processInput(input)
            resultTextView.text = result
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

    }

    private fun processInput(input: String): String {
        // Verificamos si la entrada es nula o vacía
        if (input.isEmpty()) {
            return "Ups! algo salió mal revisa tu cadena."
        }

        val length = input.length
        val mid = (length + 1) / 2 // Calculamos el punto medio

        // Dividimos la cadena en dos partes
        val firstHalf = input.substring(0, mid)
        val secondHalf = input.substring(mid)

        // Intercambiamos las partes y formamos la nueva cadena
        return secondHalf + firstHalf
    }
}