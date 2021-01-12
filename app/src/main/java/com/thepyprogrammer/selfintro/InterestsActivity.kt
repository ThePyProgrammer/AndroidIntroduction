package com.thepyprogrammer.selfintro

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

import kotlinx.android.synthetic.main.activity_interests.*

class InterestsActivity  : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_interests)

        // val main: Button = findViewById(R.id.mainButton)
        // val github: Button = findViewById(R.id.githubButton)

        mainButton.setOnClickListener {
            val toast = Toast.makeText(
                applicationContext,
                "Moving back to Profile",
                Toast.LENGTH_LONG
            )
            toast.show()

            startActivity(Intent(this@InterestsActivity, MainActivity::class.java))
        }

        githubButton.setOnClickListener {
            val toast = Toast.makeText(
                applicationContext,
                "Moving to GitHub View",
                Toast.LENGTH_LONG
            )
            toast.show()

            startActivity(Intent(this@InterestsActivity, GitHubActivity::class.java))
        }
    }
}