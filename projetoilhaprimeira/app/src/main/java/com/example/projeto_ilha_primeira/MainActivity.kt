package com.example.projeto_ilha_primeira

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // Certifique-se de que o ID esteja correto
        val goToPerguntas1Button: Button = findViewById(R.id.goToPerguntas1Button)

        // Configurar o clique do botão para navegar para Perguntas1
        goToPerguntas1Button.setOnClickListener {
            // Criar um Intent para navegar para Perguntas1
            val intent = Intent(this, Perguntas1::class.java)
            startActivity(intent)  // Inicia a Perguntas1
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
