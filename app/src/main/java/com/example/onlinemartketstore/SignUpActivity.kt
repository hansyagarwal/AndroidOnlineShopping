package com.example.onlinemartketstore

import android.app.ProgressDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.database.*

class SignUpActivity : AppCompatActivity() {

    lateinit var email : TextView
    lateinit var password : TextView
    lateinit var confirmPass : TextView
    lateinit var createB : Button
    lateinit var loadingBar : ProgressDialog


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        email = findViewById(R.id.signup_email)
        password = findViewById(R.id.signup_password)
        confirmPass = findViewById(R.id.signup_confirm)
        createB = findViewById(R.id.createAccB)
        loadingBar = ProgressDialog(this)
    }

    fun createAccount(view: View) {

        val email = email.text.toString()
        val password = password.text.toString()
        val confirmPassword = confirmPass.text.toString()

        if(email.isEmpty() || password.isEmpty() || confirmPassword.isEmpty())
            Toast.makeText(this, "All fields are necessary",Toast.LENGTH_LONG).show()
        else if(!password.equals(confirmPassword))
            Toast.makeText(this,"Passwords do not match, Check again!",Toast.LENGTH_LONG).show()
        else {
            loadingBar.setTitle("Create Account")
            loadingBar.setMessage("Please wait!")
            loadingBar.setCanceledOnTouchOutside(false)
            loadingBar.show()
        }
    }
}