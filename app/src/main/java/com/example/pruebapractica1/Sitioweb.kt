package com.example.pruebapractica1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pruebapractica1.databinding.ActivitySitiowebBinding

class Sitioweb : AppCompatActivity() {

    val hotelUrl= "https://turismo.org/hoteles-en-egipto/"

    lateinit var binding: ActivitySitiowebBinding



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sitioweb)
    }
}