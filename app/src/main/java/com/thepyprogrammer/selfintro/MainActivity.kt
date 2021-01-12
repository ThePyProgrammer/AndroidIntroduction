package com.thepyprogrammer.selfintro

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // val interests: Button = findViewById(R.id.interestsButton)
        // val github: Button = findViewById(R.id.githubButton)

        interestsButton.setOnClickListener {
            val toast = Toast.makeText(
                applicationContext,
                "Moving to Interests",
                Toast.LENGTH_LONG
            )
            toast.show()

            startActivity(Intent(this@MainActivity, InterestsActivity::class.java))
        }

        githubButton.setOnClickListener {
            val toast = Toast.makeText(
                applicationContext,
                "Moving to GitHub View",
                Toast.LENGTH_LONG
            )
            toast.show()

            startActivity(Intent(this@MainActivity, GitHubActivity::class.java))
        }
    }
}