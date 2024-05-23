package com.example.helloword

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        var btnIngresar: Button
        var IdNombre: TextView
       //VARIABLE R, SE DENOMINA A LOS RESOURCE O RECURSOS QUE SE ENCUENTREN EN LA CARPETA RES
        btnIngresar=findViewById(R.id.btnIngresar)
        IdNombre=findViewById(R.id.IdNombre)
        //CONFIGURAR LA ACCION AL PRESIONAR EL BOTON DE REGISTRO

        btnIngresar.setOnClickListener{
            //SE UTILIZA EL MENSAJE Toast PARA MOSTRAR EL SALUDO
            var nombre=IdNombre.text
            Toast.makeText(applicationContext,  //CONTEXTO
                "HOLA ${nombre}",  //TEXTO A MOSTRAR
                Toast.LENGTH_LONG).show() //DURACION DEL MENSAJE
        }
    }
}