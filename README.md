# Practicum
This is an app that is used to create a playlist using four songs with ratings and comments 
In this app the user can either search for a song using the name of the artist and song title
The user is also able to input their own information
package com.example.practicum

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.practicum.R.id.AddToPlaylist
import com.example.practicum.R.id.editTextText

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Add buttons and declare your variables
        val AddtoPlaylist=findViewById<Button>(R.id.AddToPlaylist)
        val Next=findViewById<Button>(R.id.NextButton)
        val Exit=findViewById<Button>(R.id.ExitButton)
        val EnterDetails=findViewById<EditText>(R.id.editTextText)

        // add code to the buttons that happens when clicked
        AddtoPlaylist?.setOnClickListener { Toast.makeText(this@MainActivity, "Enter the details for the playlist",Toast.LENGTH_LONG).show() }
        Next.setOnClickListener { val intent=Intent(this,DetailedViewScreen ::class.java) startActivity(intent) }
        Exit.setOnClickListener { finishAffinity()}
        // close the application
        }
    }
private infix fun Intent.startActivity(intent: Intent?): Any {
    TODO("Not yet implemented")
}
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
