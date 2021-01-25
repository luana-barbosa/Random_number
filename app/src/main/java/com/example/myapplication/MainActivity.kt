package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import org.w3c.dom.Text


class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonRandom = findViewById<Button>(R.id.buttonRandom)
        val textNumber = findViewById<TextView>(R.id.textNumber)

        buttonRandom.setOnClickListener(this)
        textNumber.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        // Código
        if (v?.id == R.id.buttonRandom || v?.id == R.id.textNumber) {
            //Lógica
        }
    }
}