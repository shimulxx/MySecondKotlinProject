package com.fnf.mysecondkotlinproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        var userName = findViewById<TextView>(R.id.userNameTextView)
        var userDesc = findViewById<TextView>(R.id.userDescriptionTextView)
        var buttonThird = findViewById<Button>(R.id.buttonStartThird)

        var name = intent.getStringExtra("name")
        var desc = intent.getStringExtra("description")

        userName.text = name
        userDesc.text = desc

        buttonThird.setOnClickListener {
            var intent = Intent(this, ThirdActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK
            startActivity(intent)
        }
    }
}