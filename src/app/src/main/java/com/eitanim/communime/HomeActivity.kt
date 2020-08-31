package com.eitanim.communime

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.eitanim.communime.api.CommuniMeService
import kotlinx.android.synthetic.main.activity_main.*


class HomeActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main1)

// check if the user signed-in already
//        val myPreference = MyPreference(this)
//
//        if(myPreference.getUserId().isNotEmpty()){
//            signInAdvance()
//            finish()
//        }

//        findViewById<Button>(R.id.buttonsignup).setOnClickListener {
//            signUp()
//        }
//
//        findViewById<Button>(R.id.buttonsignin).setOnClickListener {
//            signIn()
//        }


    }

//    private fun signInAdvance() {
//        val intent = Intent(this, DailyRatingActivity::class.java)
//
//        startActivity(intent)
//    }
//
//    private fun signUp(){
//        val intent = Intent(this, SignUpActivity::class.java)
//
//        startActivity(intent)
//    }
//
//    private fun signIn(){
//        val intent = Intent(this, SignInActivity::class.java)
//
//        startActivity(intent)
//    }

}