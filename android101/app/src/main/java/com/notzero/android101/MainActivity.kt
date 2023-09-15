package com.notzero.android101

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import androidx.activity.ComponentActivity
import androidx.core.content.ContextCompat

class MainActivity : ComponentActivity() {

    lateinit var imageMosques: ImageView
    lateinit var btnNext: Button

    val images =
        arrayListOf(R.drawable.haram_unsplash, R.drawable.medina_mosque, R.drawable.aqsa_masque)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageMosques = findViewById(R.id.img_mosques)
        btnNext = findViewById(R.id.btn_next)

        btnNext.setOnClickListener {
            imageMosques.setImageDrawable(ContextCompat.getDrawable(this, images.random()))
        }
    }
}