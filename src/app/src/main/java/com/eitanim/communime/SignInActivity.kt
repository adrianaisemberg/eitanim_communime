package com.eitanim.communime

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.eitanim.communime.api.CommuniMeService
import com.eitanim.communime.api.requests.SignInRequests
import com.eitanim.communime.api.requests.SignUpRequests

class SignInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signin)


        findViewById<Button>(R.id.button_signin).setOnClickListener {
            signIn()
        }

    }

    private fun signIn() {
        async_io {
            val email = findViewById<EditText>(R.id.text_email_signin).text.toString()
            val password = findViewById<EditText>(R.id.text_password_signin).text.toString()
            CommuniMeService.api().signIn(SignInRequests(email, password))
        }
    }
}