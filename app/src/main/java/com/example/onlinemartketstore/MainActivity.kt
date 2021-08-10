package com.example.onlinemartketstore

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
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

    fun signIn(view: View) {
        val i = Intent(this, LoginActivity::class.java)
        startActivity(i)
    }

    fun signUp(view: View) {
        val i = Intent(this,SignUpActivity::class.java)
        startActivity(i)
    }
}