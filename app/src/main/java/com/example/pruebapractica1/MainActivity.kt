package com.example.pruebapractica1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.pruebapractica1.databinding.ActivityMainBinding



class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    val hotelsher = "https://turismo.org/hoteles-en-egipto/"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnReservar.setOnClickListener {
            startActivity(Intent(this, hotelform:: class.java))
        }

        addweb()











    }


    private fun addweb(){
        val intent = Intent (this, Sitioweb::class.java)
        val key = "url"

        binding.apply {
            btnVersitioweb.setOnClickListener{
                intent.putExtra(key, hotelsher)
                startActivity(intent)

            }

        }

    }







}