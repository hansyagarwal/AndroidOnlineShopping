package com.example.onlinemartketstore

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var signInB : Button
    lateinit var signUpB : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        signInB = findViewById(R.id.alreadyAcc)
        signUpB = findViewById(R.id.createAcc)
    }
}