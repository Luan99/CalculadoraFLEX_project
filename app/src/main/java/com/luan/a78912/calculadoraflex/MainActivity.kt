package com.luan.a78912.calculadoraflex

import android.app.Activity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


       btCalcular.setOnClickListener {
           val gasolina = gasolinaEt.text.toString().toDouble() //intent.getStringExtra("GASOLINA").toDouble()
           val alcool = alcoolEt.text.toString().toDouble() //intent.getStringExtra("ALCOOL").toDouble()
           var calcular = gasolina / alcool

           resultadoTv.text = calcular.toString()

           if(calcular < 0.7){
               resultadoFinalTv.text = "Precisa abastecer com álcool"
           }else{
               resultadoFinalTv.text = "Precisa abastecer com gasolina"
           }
       }





    }










}
