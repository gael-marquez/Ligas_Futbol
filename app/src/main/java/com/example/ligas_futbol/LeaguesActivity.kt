package com.example.ligas_futbol

import android.content.Intent
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class LeaguesActivity : AppCompatActivity() {

    private val leagues = listOf(
        "Premier League (Inglaterra)",
        "La Liga (España)",
        "Bundesliga (Alemania)",
        "Serie A (Italia)",
        "Ligue 1 (Francia)"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_leagues)

        val listView = findViewById<ListView>(R.id.listview_leagues)
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, leagues)
        listView.adapter = adapter

        listView.onItemClickListener = AdapterView.OnItemClickListener { _, _, position, _ ->
            val intent = Intent(this, TeamsActivity::class.java)
            intent.putExtra("league", leagues[position]) // <-- Aquí el cambio
            startActivity(intent)
        }
    }
}