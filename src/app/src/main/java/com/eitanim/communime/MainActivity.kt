package com.eitanim.communime

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.eitanim.communime.api.CommuniMeService

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.buttonsignup).setOnClickListener {
            signUp()
        }

        findViewById<Button>(R.id.buttonsignin).setOnClickListener {
            signIn()
        }
    }

    private fun signUp(){
        val intent = Intent(this, SignUpActivity::class.java)

        startActivity(intent)
    }

    private fun signIn(){
        val intent = Intent(this, SignInActivity::class.java)

        startActivity(intent)
    }

}