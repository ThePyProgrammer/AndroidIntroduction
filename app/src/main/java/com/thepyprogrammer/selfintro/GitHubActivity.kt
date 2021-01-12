package com.thepyprogrammer.selfintro

import android.content.Intent
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class GitHubActivity  : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_github)

        val hub: WebView = findViewById(R.id.hub)
        hub.setWebViewClient(object : WebViewClient() {
            override fun shouldOverrideUrlLoading(view: WebView, url: String): Boolean {
                view.loadUrl(url)
                return false
            }
        })
        hub.loadUrl("https://github.com/ThePyProgrammer")

        val main: Button = findViewById(R.id.mainButton)
        val interests: Button = findViewById(R.id.interestsButton)

        main.setOnClickListener {
            val toast = Toast.makeText(
                applicationContext,
                "Moving back to Profile",
                Toast.LENGTH_LONG
            )
            toast.show()

            val intent = Intent(this@GitHubActivity, MainActivity::class.java)
            startActivity(intent)
        }

        interests.setOnClickListener {
            val toast = Toast.makeText(
                applicationContext,
                "Moving to Interests",
                Toast.LENGTH_LONG
            )
            toast.show()

            val intent = Intent(this@GitHubActivity, InterestsActivity::class.java)
            startActivity(intent)
        }
    }
}