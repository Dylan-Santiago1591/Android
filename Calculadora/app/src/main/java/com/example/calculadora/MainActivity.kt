package com.example.calculadora

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.text.DecimalFormat
import java.time.temporal.Temporal

class MainActivity : AppCompatActivity() {

    val Suma = "+"
    val Resta = "-"
    val Multiplicacion = "*"
    val Division = "/"

    var OperacionActual= ""

    var PrimerNumero: Double = Double.NaN
    var SegundoNumero: Double = Double.NaN

    lateinit var Temporal: TextView
    lateinit var Resultado: TextView

    lateinit var FormatoDecimal:DecimalFormat




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        FormatoDecimal = DecimalFormat("#.##########")
        Temporal=findViewById(R.id.Temporal)
        Resultado= findViewById(R.id.Resultado)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.Multiplicacion)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        fun CambiarOperacion(b:View){
            val boton:Button = b as Button
            if(boton.text.toString().trim()= "÷"){
                OperacionActual = "/"
            }else{
                OperacionActual = boton.text.toString().trim()
            }
        }


    }
}