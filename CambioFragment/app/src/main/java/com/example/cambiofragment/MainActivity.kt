package com.example.cambiofragment

import android.app.Activity
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment

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
        var btnuno=findViewById<Button>(R.id.btnuno)
        var btndos=findViewById<Button>(R.id.btndos)
        var btntres=findViewById<Button>(R.id.btntres)
        var btncuatro=findViewById<Button>(R.id.btncuatro)
        var btncinco=findViewById<Button>(R.id.btncinco)
        var btnseis=findViewById<Button>(R.id.btnseis)
        btnuno.setOnClickListener { cambioFragment(1) }
        btndos.setOnClickListener { cambioFragment(2) }
        btntres.setOnClickListener { cambioFragment(3) }
        btncuatro.setOnClickListener { cambioFragment(4) }
        btncinco.setOnClickListener { cambioFragment(5) }
        btnseis.setOnClickListener { cambioFragment(6) }
    }
    //AQUI FINALIZA EL onCreate
    fun cambioFragment(position:Int){
        //POSITION= indica el fragmento deseado
        //fragment= indica el fragmento a cambiar
        var fragment: Fragment
        when(position){
            //segun el valor de position, se va a cambiar el fragmento
            1->fragment=FirstFragment()
            2->fragment=SecondFragment()
            3->fragment=ThirdFragment()
            4->fragment=FourFragment()
            5->fragment=FiveFragment()
            6->fragment=SixFragment()
            else->fragment=FirstFragment()
        }
        //supportFragmentManager es el que gestiona el cambio del fragmento
        val fragmentManager=supportFragmentManager
        //vamos a crear el objeto de la transicion del fragmento

        val fragmentTransition=fragmentManager.beginTransaction()

        //SE CREA LA ACCION DE CAMBIO
        //fragmentTransition.replace(id-del-contenedor,clase-del-fragmento)
        fragmentTransition.replace(R.id.FCV,fragment)
        fragmentTransition.commit()
    }
}