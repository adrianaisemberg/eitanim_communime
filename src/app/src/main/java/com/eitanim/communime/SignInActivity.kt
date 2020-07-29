package com.eitanim.communime

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.eitanim.communime.api.CommuniMeService
import com.eitanim.communime.api.requests.SignInRequests


class SignInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signin)


        findViewById<Button>(R.id.button_signin).setOnClickListener {
            signIn()
        }
    }

    private fun signIn(){
        async_io {
            val userEmail = findViewById<EditText>(R.id.text_email_signin).text.toString()
            val userPassword = findViewById<EditText>(R.id.text_password_signin).text.toString()
            val response = CommuniMeService.api().signIn(SignInRequests(userEmail, userPassword))


            CurrentUser.userId = response.Id
//            CurrentUser.userEmail = userEmail
            CurrentUser.userName = response.Name
//            CurrentUser.userPassword = userPassword

            val myPreference = MyPreference(this@SignInActivity)
            myPreference.setUserId(response.Id)

            signInAdvance()
        }
    }

    private fun signInAdvance() {
        val intent = Intent(this, DailyRatingActivity::class.java)

        startActivity(intent)
    }
}
