package com.example.tples6rev3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var messageButton: Button
    private lateinit var likeButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toolbar = findViewById<androidx.appcompat.widget.Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)

        messageButton = findViewById(R.id.message_button)
        messageButton.setOnClickListener {
            Toast.makeText(
                this,
                R.string.message_click_text,
                Toast.LENGTH_LONG)
                .show()
        }

        likeButton = findViewById(R.id.like_button)
        likeButton.setOnClickListener {
            Toast.makeText(
                this,
                R.string.like_click_text,
                Toast.LENGTH_LONG)
                .show()
        }

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(androidx.core.R.menu.example_menu, menu)
        return true
    }
}