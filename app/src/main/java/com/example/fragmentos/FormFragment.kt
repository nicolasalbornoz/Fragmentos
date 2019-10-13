package com.example.fragmentos


import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_form.view.*
import java.lang.ClassCastException

class FormFragment : Fragment() {

    var interfaz: comunicador ?= null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view: View = inflater.inflate(R.layout.fragment_form, container, false)

        view.bEnviar.setOnClickListener {

            var nombre:String = view.edNombre.text.toString()
            var cedula:String = view.edCedula.text.toString()

            interfaz?.enviarDatos(nombre,cedula)
        }
        return view
    }

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        try{
            interfaz = context!! as comunicador
        }catch (e: ClassCastException){
            Log.d("exception",e.toString())
        }
    }
}

