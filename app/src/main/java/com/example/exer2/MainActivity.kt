package com.example.exer2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var panelImage: ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        panelImage = findViewById(R.id.championRoller)

        val startbtn: Button= findViewById(R.id.startButton)
        startbtn.setOnClickListener{ randomChampion() }

        val resetbtn: Button= findViewById(R.id.resetButton)
        resetbtn.setOnClickListener{resetBack()}


    }

    private fun randomChampion() {

        val randomInt = (1..10).random()

        val drawableResource = when(randomInt){
            1 -> R.drawable.aphelios
            2 -> R.drawable.caitlyn
            3 -> R.drawable.darius
            4 -> R.drawable.ekko
            5 -> R.drawable.kayle
            6 -> R.drawable.morgana
            7 -> R.drawable.senna
            8 -> R.drawable.sett
            9 -> R.drawable.soraka

            else -> R.drawable.vayne
        }

        panelImage.setImageResource(drawableResource)

    }

    private fun resetBack(){
        panelImage.setImageResource(R.drawable.logo)
    }

}
