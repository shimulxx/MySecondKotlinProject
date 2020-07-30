package com.fnf.mysecondkotlinproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var userName = findViewById<EditText>(R.id.editTextUserName)
        var desc = findViewById<EditText>(R.id.editTextUserDesc)
        var go = findViewById<Button>(R.id.buttonGo)

        go.setOnClickListener {
            var name = userName.text.toString()
            var description = desc.text.toString()
            var intent = Intent(this@MainActivity, SecondActivity::class.java)
            intent.putExtra("name", name)
            intent.putExtra("description", description)
            startActivity(intent)
        }
    }
}