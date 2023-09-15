package com.notzero.tourguide

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat


class DetailsActivity : AppCompatActivity() {

    lateinit var imgFlower: ImageView
    lateinit var txtFlowerName: TextView
    lateinit var btnLearnMore: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        val flowerName = intent.getStringExtra("FLOWER_NAME")
        val flowerImage = intent.getIntExtra("FLOWER_IMAGE", 0)
        val flowerInfo = intent.getStringExtra("FLOWER_INFO")

        imgFlower = findViewById(R.id.img_flower)
        txtFlowerName = findViewById(R.id.txt_flower_name)
        btnLearnMore = findViewById(R.id.btn_learn_more)

        txtFlowerName.text = flowerName
        imgFlower.setImageDrawable(ContextCompat.getDrawable(this, flowerImage))

        btnLearnMore.setOnClickListener {
            val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse(flowerInfo))
            startActivity(browserIntent)
        }
    }
}