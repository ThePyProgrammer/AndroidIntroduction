package com.thepyprogrammer.selfintro

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val interests: Button = findViewById(R.id.interestsButton)
        val github: Button = findViewById(R.id.githubButton)

        interests.setOnClickListener {
            val toast = Toast.makeText(
                applicationContext,
                "Moving to Interests",
                Toast.LENGTH_LONG
            )
            toast.show()

            val intent = Intent(this@MainActivity, InterestsActivity::class.java)
            startActivity(intent)
        }

        github.setOnClickListener {
            val toast = Toast.makeText(
                applicationContext,
                "Moving to GitHub View",
                Toast.LENGTH_LONG
            )
            toast.show()

            val intent = Intent(this@MainActivity, GitHubActivity::class.java)
            startActivity(intent)
        }
    }
}