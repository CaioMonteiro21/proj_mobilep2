package com.example.projeto_ilha_primeira



import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class Perguntas10 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perguntas10)

        val radioGroupTrabalha = findViewById<RadioGroup>(R.id.radioGroupTrabalha)
        val layoutPerguntaMunicipio = findViewById<LinearLayout>(R.id.layoutPerguntaMunicipio)
        val btnProximo = findViewById<Button>(R.id.btnProximo)
        val btnVoltar = findViewById<Button>(R.id.btnVoltar)

        // Mostrar ou ocultar a segunda pergunta com base na resposta
        radioGroupTrabalha.setOnCheckedChangeListener { _, checkedId ->
            when (checkedId) {
                R.id.radioSim -> layoutPerguntaMunicipio.visibility = View.VISIBLE
                R.id.radioNao -> layoutPerguntaMunicipio.visibility = View.GONE
            }
        }

        btnProximo.setOnClickListener {
            // Aqui você pode validar os campos e seguir para a próxima tela
            Toast.makeText(this, "Continuar", Toast.LENGTH_SHORT).show()
        }

        btnVoltar.setOnClickListener {
            finish()
        }
    }
}
