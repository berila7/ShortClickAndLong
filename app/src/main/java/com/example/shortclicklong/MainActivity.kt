package com.example.shortclicklong

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n", "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<Button>(R.id.button)
        val text = findViewById<TextView>(R.id.tvText)

        btn.setOnClickListener {
            text.text = "Click"
        }
        btn.setOnLongClickListener {
            text.text = "Long Click"
            return@setOnLongClickListener true
        }
    }
}