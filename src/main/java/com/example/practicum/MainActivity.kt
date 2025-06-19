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
