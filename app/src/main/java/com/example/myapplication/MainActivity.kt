package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (supportActionBar != null){
            supportActionBar!!.hide()
        }

        buttonRandom.setOnClickListener(this)
        textNumber.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        // Código
        if (v?.id == R.id.buttonRandom || v?.id == R.id.textNumber) {
            //Lógica
            textNumber.text = random().toString()
        }
    }

    private fun random(): Int {
     return Random.nextInt(50)+1
    }
}