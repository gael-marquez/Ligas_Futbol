package com.example.ligas_futbol

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        // 1. Aplica el modo oscuro/claro guardado
        val prefs = getSharedPreferences("settings", MODE_PRIVATE)
        val isDarkMode = prefs.getBoolean("dark_mode", false)
        if (isDarkMode) {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
        } else {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        }

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 2. Botón para cambiar de tema
        val btnTheme = findViewById<Button>(R.id.btn_toggle_theme)
        btnTheme.setOnClickListener {
            val newValue = !prefs.getBoolean("dark_mode", false)
            prefs.edit().putBoolean("dark_mode", newValue).apply()
            if (newValue) {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
            } else {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
            }
        }

        // 3. Botón para ver ligas
        val btnViewLeagues = findViewById<Button>(R.id.btn_view_leagues)
        btnViewLeagues.setOnClickListener {
            val intent = Intent(this, LeaguesActivity::class.java)
            startActivity(intent)
        }
    }
}