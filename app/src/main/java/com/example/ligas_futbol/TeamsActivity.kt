package com.example.ligas_futbol

import android.content.Intent
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class TeamsActivity : AppCompatActivity() {

    private val premierLeagueTeams = listOf(
        "Manchester City",
        "Arsenal",
        "Liverpool",
        "Aston Villa",
        "Tottenham Hotspur",
        "Chelsea",
        "Newcastle United",
        "Manchester United",
        "West Ham United",
        "Crystal Palace",
        "Brighton & Hove Albion",
        "Bournemouth",
        "Fulham",
        "Wolverhampton Wanderers",
        "Everton",
        "Brentford",
        "Nottingham Forest",
        "Luton Town",
        "Burnley",
        "Sheffield United"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_teams)

        val leagueName = intent.getStringExtra("league")
        val titleTextView = findViewById<TextView>(R.id.tv_league_title)
        titleTextView.text = leagueName

        val listView = findViewById<ListView>(R.id.listview_teams)
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, premierLeagueTeams)
        listView.adapter = adapter

        listView.onItemClickListener = AdapterView.OnItemClickListener { _, _, position, _ ->
            when (position) {
                0 -> { // Manchester City
                    val intent = Intent(this, PlayersActivity::class.java)
                    intent.putExtra("team", premierLeagueTeams[position])
                    startActivity(intent)
                }
                // Por ahora solo implementamos Manchester City
                else -> {
                    // Aquí puedes agregar los otros equipos después
                }
            }
        }
    }
}