package com.example.practicum

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

private infix fun Unit.finish(unit: Unit) {
    TODO("Not yet implemented")
}

class DetailedViewScreen : AppCompatActivity() {
    private fun Song(s: String , s1: String , s2: String , s3: String):
    // list of songs

    val songs
        get() = listOf(
            Song("AVA" , "Pipe Millet" , "5of5" , "RNB") ,
            Song("Grateful" , "Mmatema" , "3of5" , "Gospel") ,
            Song("Weak" , "SWV" , "4of5" , "Good love song") ,
            Song("Deda" , "Samthing Soweto" , "5of5" , "Amapiano")
        )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detailed_view_screen)
        val DisplaySuggestion = findViewById<TextView>(R.id.SongList)
        val Ratings = findViewById<Button>(R.id.RatingButton)
        val ShowSong = findViewById<Button>(R.id.ShowSongButton)
        val Return = findViewById<Button>(R.id.ReturnButton)

        ShowSong.setOnClickListener {
            var output = ""
            for ((index , song) in songs.withIndex) {
                output += "Song ${index + 1}:\nTitle:${song.title}\nArtist: ${song.artist}\nRating: ${song.rating}\nComment: ${song.comment}\n\n"
            }
            DisplaySuggestion.text = output
            Ratings.setOnClickListener {
                var sum = of
                for (song in songs) {
                    sum += song.rating
                }
                val average = sum / songs.size
                DisplaySuggestion.text = "Average rating:%.of".format(average)
            }
            Return.setOnClickListener {
                val intent = Intent(this , MainActivity::class.java)
                startActivity(intent) finish()
            }
        }
    }
}
