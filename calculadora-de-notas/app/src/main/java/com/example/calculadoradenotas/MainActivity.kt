package com.example.calculadoradenotas

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btCalcular = calcular
        val res = resultado


        btCalcular.setOnClickListener{
            val n1 = Integer.parseInt(nota1.text.toString())
            val n2 = Integer.parseInt(nota2.text.toString())
            val media: Double = ((n1 + n2) / 2).toDouble()
            val fts = Integer.parseInt(faltas.text.toString())


            if (media >= 6 && fts <= 10){
                res.setText("Parabéns, você foi aprovado!\n Nota Final: $media \n Faltas: $fts")
                res.setTextColor(Color.BLUE)
            }
            else {
                res.setText("Você foi reprovado.\n Nota final: $media \n Faltas: $fts")
                res.setTextColor(Color.RED)
            }

        }
    }
}