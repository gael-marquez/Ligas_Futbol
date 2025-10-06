package com.example.ligas_futbol

import android.content.Intent
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class TeamsActivity : AppCompatActivity() {

    private val premierLeagueTeams = listOf("Arsenal", "Chelsea", "Liverpool", "Manchester City")

    private val laLigaTeams = listOf("Atlético Madrid", "Barcelona", "Real Madrid")

    private val bundesligaTeams = listOf("Bayern Munich", "Borussia Dortmund", "RB Leipzig")

    private val serieATeams = listOf("Inter Milan", "Juventus", "AC Milan")

    private val ligue1Teams = listOf("Lyon", "Marseille", "Paris Saint-Germain")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_teams)

        val leagueName = intent.getStringExtra("league")
        val titleTextView = findViewById<TextView>(R.id.tv_league_title)
        titleTextView.text = leagueName

        val listView = findViewById<ListView>(R.id.listview_teams)
        val teams = when (leagueName) {
            "Premier League (Inglaterra)" -> premierLeagueTeams
            "La Liga (España)" -> laLigaTeams
            "Bundesliga (Alemania)" -> bundesligaTeams
            "Serie A (Italia)" -> serieATeams
            "Ligue 1 (Francia)" -> ligue1Teams
            else -> emptyList()
        }
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, teams)
        listView.adapter = adapter

        listView.onItemClickListener = AdapterView.OnItemClickListener { _, _, position, _ ->
            val intent = Intent(this, PlayersActivity::class.java)
            intent.putExtra("team", teams[position])
            startActivity(intent)
        }
    }
}