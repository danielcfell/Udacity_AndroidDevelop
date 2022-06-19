package com.example.aboutme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var nicktxt : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        nicktxt = findViewById(R.id.nickname_Text)
        findViewById<Button>(R.id.button).setOnClickListener{
            writeName(it)
        }
    }

    private fun writeName(view: View){
        val editText = findViewById<EditText>(R.id.name_edit)
        val nickname = findViewById<TextView>(R.id.nickname_Text)
        nickname.text = editText.text
        nickname.visibility = View.VISIBLE
    }
}