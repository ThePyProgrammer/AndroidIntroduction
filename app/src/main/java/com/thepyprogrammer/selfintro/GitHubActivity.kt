package com.thepyprogrammer.selfintro

import android.content.Intent
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

import kotlinx.android.synthetic.main.activity_github.*

class GitHubActivity  : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_github)

        // val hub: WebView = findViewById(R.id.hub)
        hub.setWebViewClient(object : WebViewClient() {
            override fun shouldOverrideUrlLoading(view: WebView, url: String): Boolean {
                view.loadUrl(url)
                return false
            }
        })
        hub.loadUrl("https://github.com/ThePyProgrammer")

        // val main: Button = findViewById(R.id.mainButton)
        // val interests: Button = findViewById(R.id.interestsButton)

        mainButton.setOnClickListener {
            val toast = Toast.makeText(
                applicationContext,
                "Moving back to Profile",
                Toast.LENGTH_LONG
            )
            toast.show()

            startActivity(Intent(this@GitHubActivity, MainActivity::class.java))
        }

        interestsButton.setOnClickListener {
            val toast = Toast.makeText(
                applicationContext,
                "Moving to Interests",
                Toast.LENGTH_LONG
            )
            toast.show()

            startActivity(Intent(this@GitHubActivity, InterestsActivity::class.java))
        }
    }
}