package com.example.pruebapractica1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import com.example.pruebapractica1.databinding.ActivityHotelformBinding



class hotelform : AppCompatActivity(), AdapterView.OnItemSelectedListener {

    lateinit var binding: ActivityHotelformBinding
    private var opciones = arrayListOf("Habitación Común", "Habitación con vista", "Suite con terraza")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityHotelformBinding.inflate(layoutInflater)
        setContentView(binding.root)




        val spinnerAdapter = ArrayAdapter(
            this,
            R.layout.support_simple_spinner_dropdown_item,
            opciones,


            )

        binding.spinnerRes.apply {
            adapter = spinnerAdapter
            setSelection(0, true)
            onItemSelectedListener = this@hotelform
        }



    }

    override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {

    }

    override fun onNothingSelected(p0: AdapterView<*>?) {

    }


}