package com.example.cambiofragment

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)

        val listView = findViewById<ListView>(R.id.MyListView)
        val nombres = arrayListOf("Bugatti","Maserati","Lamborghini","Mclaren","AstonMartin")

        val arrayAdapter: ArrayAdapter<String> = ArrayAdapter(this, android.R.layout.simple_list_item_1, nombres)
        listView.adapter = arrayAdapter
        listView.setOnItemClickListener { adapterViewm, view, i, l -> Toast.makeText(this, "Selecciono" + nombres[i], Toast.LENGTH_SHORT).show()}
    }
}