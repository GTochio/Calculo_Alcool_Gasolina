package com.tads.alcoolgasolina

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun btCalcular(view: View){

        //val precoAlcool = findViewById<EditText>(r.id.edit_preco_alcool)
        val precoAlcool = edit_preco_alcool.text.toString()
        val precoGasolina = edit_preco_gasolina.text.toString()
        val validaCampo = validaCampo(precoAlcool, precoGasolina)

        if( validaCampo ){
            //calcularMelhorPreco..
        }else{
            text_resultado.setText("Preencha os Preços primeiro")
        }

    }
    fun validaCampo(precoAlcool:String, precoGasolina:String) : Boolean{

        var camposValidados:Boolean = true

        if(precoAlcool == null || precoAlcool.equals("")){
            camposValidados = false
        }else if (precoGasolina == null || precoGasolina.equals("")){
            camposValidados = false
        }

        return  camposValidados

    }




}
