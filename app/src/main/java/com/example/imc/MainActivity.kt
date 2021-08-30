package com.example.imc

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Link para parte do layout com nosso código
        // val = criação da variável
        val editPeso = findViewById<EditText>(R.id.edit_peso)
        val buttonCalcular = findViewById<Button>(R.id.btn_calular)

        // Evento de click para botão
        buttonCalcular.setOnClickListener {
            Toast.makeText(this, "editPeso.text.toString()", Toast.LENGTH_SHORT).show()
        }
    }
}