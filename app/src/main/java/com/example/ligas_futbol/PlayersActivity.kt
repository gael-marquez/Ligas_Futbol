package com.example.ligas_futbol

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class PlayersActivity : AppCompatActivity() {

    private val manchesterCityPlayers = listOf(
        "Ederson (Portero)",
        "Kyle Walker (Defensa)",
        "Rúben Dias (Defensa)",
        "Nathan Aké (Defensa)",
        "Joško Gvardiol (Defensa)",
        "Rodri (Centrocampista)",
        "Kevin De Bruyne (Centrocampista)",
        "Bernardo Silva (Centrocampista)",
        "Phil Foden (Centrocampista)",
        "Jack Grealish (Extremo)",
        "Erling Haaland (Delantero)",
        "Julián Álvarez (Delantero)",
        "Riyad Mahrez (Extremo)",
        "İlkay Gündoğan (Centrocampista)",
        "John Stones (Defensa)"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_players)

        val teamName = intent.getStringExtra("team")
        val titleTextView = findViewById<TextView>(R.id.tv_team_title)
        titleTextView.text = "$teamName - Plantilla"

        val listView = findViewById<ListView>(R.id.listview_players)
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, manchesterCityPlayers)
        listView.adapter = adapter
    }
}