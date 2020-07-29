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
            signInAdvance()
        }

    }

    private fun signIn(){
        async_io {
            val userEmail = findViewById<EditText>(R.id.text_email_signin).text.toString()
            val userPassword = findViewById<EditText>(R.id.text_password_signin).text.toString()
            val data= CommuniMeService.api().signIn(SignInRequests(userEmail, userPassword))
            //a string of the data
            val dataString = data.toString()

            //these are the only two not already known from the user's input
            //I'm getting the name here by cutting the string made from the data variable
            var userName = dataString.substring(37)
            var h: Int = userName.indexOf("Name")
            userName = userName.substring(h+5)
            var k: Int = userName.indexOf(',')
            userName = userName.substring(0, k)

            //getting the id is much easier and simpler than getting the name
            var userId = (dataString.toString()).substring(4, 36)

            CurrentUser.changeId(userId)
            CurrentUser.changeEmail(userEmail)
            CurrentUser.changeName(userName)
            CurrentUser.changePassword(userPassword)
        }
    }

    private fun signInAdvance() {
        val intent = Intent(this, DailyRatingActivity::class.java)

        startActivity(intent)
    }
}

private fun String.find(predicate: String) {

}
