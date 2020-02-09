package com.example.exer2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var panelImage: ImageView
    lateinit var descriptionPanel: TextView
    lateinit var headerText: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        panelImage = findViewById(R.id.championRoller)
        descriptionPanel = findViewById(R.id.descrip)
        headerText = findViewById(R.id.title)

        val startbtn: Button= findViewById(R.id.startButton)
        startbtn.setOnClickListener{ randomChampion() }

        val resetbtn: Button= findViewById(R.id.resetButton)
        resetbtn.setOnClickListener{resetBack()}


    }

    private fun randomChampion() {

        headerText.setText(R.string.header_rolled)

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

        val stringResource = when(randomInt){
            1-> R.string.descrip_aphelios
            2-> R.string.descrip_caitlyn
            3-> R.string.descrip_darius
            4-> R.string.descrip_ekko
            5-> R.string.descrip_kayle
            6-> R.string.descrip_morgana
            7-> R.string.descrip_senna
            8-> R.string.descrip_sett
            9-> R.string.descrip_soraka

            else -> R.string.descrip_vayne
        }

        panelImage.setImageResource(drawableResource)
        descriptionPanel.setText(stringResource)

    }

    private fun resetBack(){
        headerText.setText(R.string.header)
        panelImage.setImageResource(R.drawable.logo)
        descriptionPanel.setText(R.string.default_descrip)
    }

}
