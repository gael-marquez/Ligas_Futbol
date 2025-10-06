package com.example.ligas_futbol

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class PlayersActivity : AppCompatActivity() {

    // Premier League
    private val manchesterCityPlayers = listOf("Ederson", "Kevin De Bruyne", "Erling Haaland")
    private val arsenalPlayers = listOf("Aaron Ramsdale", "Martin Ødegaard", "Bukayo Saka")
    private val liverpoolPlayers = listOf("Alisson", "Mohamed Salah", "Virgil van Dijk")
    private val chelseaPlayers = listOf("Enzo Fernández", "Raheem Sterling", "Thiago Silva")

    // La Liga
    private val realMadridPlayers = listOf("Thibaut Courtois", "Jude Bellingham", "Vinícius Jr.")
    private val barcelonaPlayers = listOf("Marc-André ter Stegen", "Frenkie de Jong", "Robert Lewandowski")
    private val atleticoMadridPlayers = listOf("Jan Oblak", "Antoine Griezmann", "Álvaro Morata")

    // Bundesliga
    private val bayernMunichPlayers = listOf("Manuel Neuer", "Jamal Musiala", "Harry Kane")
    private val borussiaDortmundPlayers = listOf("Gregor Kobel", "Julian Brandt", "Niclas Füllkrug")
    private val rbLeipzigPlayers = listOf("Peter Gulácsi", "Dani Olmo", "Loïs Openda")

    // Serie A
    private val interMilanPlayers = listOf("Yann Sommer", "Lautaro Martínez", "Nicolò Barella")
    private val juventusPlayers = listOf("Wojciech Szczęsny", "Federico Chiesa", "Dusan Vlahovic")
    private val acMilanPlayers = listOf("Mike Maignan", "Rafael Leão", "Olivier Giroud")

    // Ligue 1
    private val psgPlayers = listOf("Gianluigi Donnarumma", "Kylian Mbappé", "Ousmane Dembélé")
    private val lyonPlayers = listOf("Anthony Lopes", "Alexandre Lacazette", "Corentin Tolisso")
    private val marseillePlayers = listOf("Pau López", "Pierre-Emerick Aubameyang", "Jonathan Clauss")

    // Puedes agregar más equipos aquí...

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_players)

        val teamName = intent.getStringExtra("team")
        val titleTextView = findViewById<TextView>(R.id.tv_team_title)
        titleTextView.text = "$teamName - Plantilla"

        // Selecciona la plantilla según el equipo recibido
        val players = when (teamName) {
            // Premier League
            "Manchester City" -> manchesterCityPlayers
            "Arsenal" -> arsenalPlayers
            "Liverpool" -> liverpoolPlayers
            "Chelsea" -> chelseaPlayers
            // La Liga
            "Real Madrid" -> realMadridPlayers
            "Barcelona" -> barcelonaPlayers
            "Atlético Madrid" -> atleticoMadridPlayers
            // Bundesliga
            "Bayern Munich" -> bayernMunichPlayers
            "Borussia Dortmund" -> borussiaDortmundPlayers
            "RB Leipzig" -> rbLeipzigPlayers
            // Serie A
            "Inter Milan" -> interMilanPlayers
            "Juventus" -> juventusPlayers
            "AC Milan" -> acMilanPlayers
            // Ligue 1
            "Paris Saint-Germain" -> psgPlayers
            "Lyon" -> lyonPlayers
            "Marseille" -> marseillePlayers
            // Otros equipos
            else -> listOf("Jugadores no disponibles para este equipo")
        }

        val listView = findViewById<ListView>(R.id.listview_players)
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, players)
        listView.adapter = adapter
    }
}