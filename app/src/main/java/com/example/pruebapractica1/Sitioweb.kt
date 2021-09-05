package com.example.pruebapractica1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pruebapractica1.databinding.ActivitySitiowebBinding

class Sitioweb : AppCompatActivity() {



    lateinit var binding: ActivitySitiowebBinding



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySitiowebBinding.inflate(layoutInflater)

        setContentView(binding.root)


        var hotelurl = intent.getStringExtra("url").toString()
        binding.wbHotel .loadUrl(hotelurl)

    }
}