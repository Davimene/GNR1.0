package com.example.geradordenumeroreal

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val gerarNumerosBtn: Button = findViewById(R.id.gerarNumerosBtn)
        val numerosGeradosTxt: TextView = findViewById(R.id.numerosGeradosTxt)

        gerarNumerosBtn.setOnClickListener {
            val listaNumeros = gerarNumeros()
            numerosGeradosTxt.text = listaNumeros.joinToString("\n")
        }
    }

    private fun gerarNumeros(): List<String> {
        val d = "wa.me/55"
        val c = "9"

        return List(10) {
            "$d${gerarA()}$c${gerarB()}"
        }
    }

    private fun gerarA(): String {
        return (0..1).map { Random.nextInt(10) }.joinToString("")
    }

    private fun gerarB(): String {
        return (0..7).map { Random.nextInt(10) }.joinToString("")
    }
}
