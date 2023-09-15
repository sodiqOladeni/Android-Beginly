package com.notzero.tourguide

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    lateinit var layoutCarnation: LinearLayout
    lateinit var layoutIris: LinearLayout
    lateinit var layoutTulip: LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        layoutCarnation = findViewById(R.id.layout_carnation)
        layoutIris = findViewById(R.id.layout_iris)
        layoutTulip = findViewById(R.id.layout_tulip)

        layoutCarnation.setOnClickListener {
            val detailsIntent = Intent(this, DetailsActivity::class.java)
            detailsIntent.putExtra("FLOWER_IMAGE", R.drawable.flower_carnation)
            detailsIntent.putExtra("FLOWER_NAME", getString(R.string.carnation))
            detailsIntent.putExtra("FLOWER_INFO", "https://www.google.com/search?q=carnation+flower&rlz=1C5CHFA_enNG970NG975&oq=carnation+flower&aqs=chrome.0.0i271j46i512j0i512l8.3777j0j4&sourceid=chrome&ie=UTF-8&bshm=rime/1")
            startActivity(detailsIntent)
        }
        layoutIris.setOnClickListener {
            val detailsIntent = Intent(this, DetailsActivity::class.java)
            detailsIntent.putExtra("FLOWER_IMAGE", R.drawable.flower_iris)
            detailsIntent.putExtra("FLOWER_NAME", getString(R.string.iris))
            detailsIntent.putExtra("FLOWER_INFO", "https://www.google.com/search?q=iris+flower&sca_esv=562751389&rlz=1C5CHFA_enNG970NG975&sxsrf=AB5stBhJ2oEdSzrs27VjzksNs7-Ld3sOPQ%3A1693923097243&ei=GTf3ZOK4DsSKhbIPxJGp2AQ&ved=0ahUKEwiiqfOj05OBAxVERUEAHcRICksQ4dUDCA8&uact=5&oq=iris+flower&gs_lp=Egxnd3Mtd2l6LXNlcnAiC2lyaXMgZmxvd2VyMgYQABgHGB4yBhAAGAcYHjIGEAAYBxgeMgYQABgHGB4yBhAAGAcYHjIGEAAYBxgeMgYQABgHGB4yBhAAGAcYHjIGEAAYBxgeMgYQABgHGB5IoRZQkQxY_RRwAngBkAEAmAGEAqABswWqAQMyLTO4AQPIAQD4AQHCAgoQABhHGNYEGLADwgIKEAAYigUYsAMYQ8ICDhAAGOQCGNYEGLAD2AEBwgIQEC4YigUYyAMYsAMYQ9gBAuIDBBgAIEGIBgGQBhO6BgYIARABGAm6BgYIAhABGAg&sclient=gws-wiz-serp&bshm=rime/1")
            startActivity(detailsIntent)
        }
        layoutTulip.setOnClickListener {
            val detailsIntent = Intent(this, DetailsActivity::class.java)
            detailsIntent.putExtra("FLOWER_IMAGE", R.drawable.flower_tulip)
            detailsIntent.putExtra("FLOWER_NAME", getString(R.string.tulip))
            detailsIntent.putExtra("FLOWER_INFO", "https://www.google.com/search?q=tulip+flower&sca_esv=562751389&rlz=1C5CHFA_enNG970NG975&sxsrf=AB5stBj-jXFYiNPJzaY0Iy6aT72Hus_C1Q%3A1693923118475&ei=Ljf3ZOfZHLyUhbIPoLmWyAM&ved=0ahUKEwjnqIOu05OBAxU8SkEAHaCcBTkQ4dUDCA8&uact=5&oq=tulip+flower&gs_lp=Egxnd3Mtd2l6LXNlcnAiDHR1bGlwIGZsb3dlcjIHEC4YigUYQzIHEAAYigUYQzIGEAAYBxgeMgYQABgHGB4yBhAAGAcYHjIFEAAYgAQyBhAAGAcYHjIGEAAYBxgeMgUQABiABDIFEAAYgAQyFhAuGIoFGEMYlwUY3AQY3gQY3wTYAQNIsB1QtQdYpxlwAngBkAEAmAGMAqABpwmqAQMyLTW4AQPIAQD4AQHCAgoQABhHGNYEGLADwgIKEAAYigUYsAMYQ8ICDhAAGOQCGNYEGLAD2AEBwgIQEC4YigUYyAMYsAMYQ9gBAuIDBBgAIEGIBgGQBhO6BgYIARABGAm6BgYIAhABGAi6BgYIAxABGBQ&sclient=gws-wiz-serp")
            startActivity(detailsIntent)
        }
    }
}