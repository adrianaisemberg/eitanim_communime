package com.eitanim.communime

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.eitanim.communime.api.CommuniMeService
import com.eitanim.communime.api.requests.SignUpRequests

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)


        findViewById<Button>(R.id.button_signup).setOnClickListener {
            signUp()
        }

    }

    private fun signUp() {
        async_io {


            val userName = findViewById<EditText>(R.id.text_username).text.toString()
            val email = findViewById<EditText>(R.id.text_email).text.toString()
            val password = findViewById<EditText>(R.id.text_password).text.toString()
            val response = CommuniMeService.api().signUp(SignUpRequests(userName, email, password))



            val myPreference = MyPreference(this@SignUpActivity)
            myPreference.setUserId(response.Id)

            var x = response.toString()
            myPreference.setUserId(x.substring(5,36))

            x = (x.substring(5,36))

            println("yoyoyoyo")
            println(x)
            println("yoyoyoyo")

            signUpAdvance()
        }
    }

    private fun signUpAdvance() {
        val intent = Intent(this, DailyRatingActivity::class.java)

        startActivity(intent)
    }
}