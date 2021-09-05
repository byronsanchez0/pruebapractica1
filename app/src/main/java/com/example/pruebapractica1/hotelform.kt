package com.example.pruebapractica1

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.AdapterView
import android.widget.ArrayAdapter
import com.example.pruebapractica1.databinding.ActivityHotelformBinding
import com.google.android.material.snackbar.Snackbar


class hotelform : AppCompatActivity(), AdapterView.OnItemSelectedListener {

    lateinit var binding: ActivityHotelformBinding
    private var opciones =
        arrayListOf("Habitación Común", "Habitación con vista", "Suite con terraza")

    lateinit var view: View

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityHotelformBinding.inflate(layoutInflater)
        view = binding.root
        setContentView(view)


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

        showInfo()


    }


    private fun showInfo() {
        binding.btnConfirm.setOnClickListener {
            hideKeyboard()


            var message =
                "Nombre: ${binding.etName.text}" + " Apellido: ${binding.etLastname.text}" + " Tipo de reservacion: ${binding.spinnerRes.selectedItem}"
            Snackbar.make(it, message, Snackbar.LENGTH_SHORT).show()
        }
    }

    private fun hideKeyboard(){
        val manager = getSystemService(Activity.INPUT_METHOD_SERVICE) as InputMethodManager
        manager.hideSoftInputFromWindow(view.windowToken, 0)
    }


    override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {

    }

    override fun onNothingSelected(p0: AdapterView<*>?) {

    }


}