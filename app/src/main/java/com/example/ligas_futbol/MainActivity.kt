package com.example.ligas_futbol

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnViewLeagues = findViewById<Button>(R.id.btn_view_leagues)

        btnViewLeagues.setOnClickListener {
            val intent = Intent(this, LeaguesActivity::class.java)
            startActivity(intent)
        }
    }
}