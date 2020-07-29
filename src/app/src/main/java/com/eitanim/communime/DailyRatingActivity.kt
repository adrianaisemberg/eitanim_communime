package com.eitanim.communime

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.view.View.GONE
import android.view.View.VISIBLE
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.eitanim.communime.api.CommuniMeService
import com.eitanim.communime.api.requests.DailyRatingsRequests
import com.eitanim.communime.api.requests.SignInRequests
import com.eitanim.communime.api.requests.SignUpRequests
import kotlinx.android.synthetic.main.activity_dailyrating.*

var numStars = 0.0

class DailyRatingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dailyrating)

        val myPreference = MyPreference(this)
        var lifetimeRating = myPreference.getLoginCount()


        findViewById<Button>(R.id.button_dailyrating_continue).setOnClickListener {
            rating()
        }

        findViewById<Button>(R.id.dailyrating_button_1).setOnClickListener {
            DailyStar_1()
            DisplayContinueButton()

            lifetimeRating += 1
            myPreference.setLoginCount(lifetimeRating)
            testText.text = lifetimeRating.toString()
        }

        findViewById<Button>(R.id.dailyrating_button_2).setOnClickListener {
            DailyStar_2()
            DisplayContinueButton()
            lifetimeRating += 2

            myPreference.setLoginCount(lifetimeRating)
            testText.text = lifetimeRating.toString()
        }

        findViewById<Button>(R.id.dailyrating_button_3).setOnClickListener {
            DailyStar_3()
            DisplayContinueButton()
            lifetimeRating += 3
            myPreference.setLoginCount(lifetimeRating)
            testText.text = lifetimeRating.toString()
        }

        findViewById<Button>(R.id.dailyrating_button_4).setOnClickListener {
            DailyStar_4()
            DisplayContinueButton()
            lifetimeRating += 4
            myPreference.setLoginCount(lifetimeRating)
            testText.text = lifetimeRating.toString()
        }

        findViewById<Button>(R.id.dailyrating_button_5).setOnClickListener {
            DailyStar_5()
            DisplayContinueButton()
            lifetimeRating += 5
            myPreference.setLoginCount(lifetimeRating)
            testText.text = lifetimeRating.toString()
        }

    }

    private fun rating() {
        async_io {
            val userId = CurrentUser.getId()
            val rating = numStars.toString()
            CommuniMeService.api().dailyRatings(DailyRatingsRequests(userId, rating))

//            val intent = Intent(this@DailyRatingActivity, ActivityRating_1::class.java)
//
//            startActivity(intent)
        }


    }

    private fun DisplayContinueButton(){
        button_dailyrating_continue.visibility = VISIBLE
    }

    private fun hideAllHalfStars(){
        hide(dailyhalf_star_1)
        hide(dailyhalf_star_2)
        hide(dailyhalf_star_3)
        hide(dailyhalf_star_4)
        hide(dailyhalf_star_5)
    }

    private fun DailyStar_1() {
        if(numStars != 1.0) {
            hide(dailyunfilled_star_1)
            show(dailyunfilled_star_2)
            show(dailyunfilled_star_3)
            show(dailyunfilled_star_4)
            show(dailyunfilled_star_5)

            hideAllHalfStars()
            numStars = 1.0
        }

        else{
            show(dailyunfilled_star_1)
            show(dailyhalf_star_1)
            numStars = 0.5
        }

    }

    private fun DailyStar_2() {
        if(numStars != 2.0) {
            hide(dailyunfilled_star_1)
            hide(dailyunfilled_star_2)
            show(dailyunfilled_star_3)
            show(dailyunfilled_star_4)
            show(dailyunfilled_star_5)

            hideAllHalfStars()
            numStars = 2.0
        }

        else{
            show(dailyunfilled_star_2)
            show(dailyhalf_star_2)
            numStars = 1.5
        }
    }

    private fun DailyStar_3() {
        if(numStars != 3.0) {
            hide(dailyunfilled_star_1)
            hide(dailyunfilled_star_2)
            hide(dailyunfilled_star_3)
            show(dailyunfilled_star_4)
            show(dailyunfilled_star_5)

            hideAllHalfStars()
            numStars = 3.0
        }

        else{

            show(dailyunfilled_star_3)

            show(dailyhalf_star_3)
            numStars = 2.5
        }
    }

    private fun DailyStar_4() {
        if(numStars != 4.0) {
            hide(dailyunfilled_star_1)
            hide(dailyunfilled_star_2)
            hide(dailyunfilled_star_3)
            hide(dailyunfilled_star_4)
            show(dailyunfilled_star_5)

            hideAllHalfStars()
            numStars = 4.0
        }

        else{
            show(dailyunfilled_star_4)

            show(dailyhalf_star_4)
            numStars = 3.5
        }
    }

    private fun DailyStar_5() {
        if(numStars != 5.0) {
            hide(dailyunfilled_star_1)
            hide(dailyunfilled_star_2)
            hide(dailyunfilled_star_3)
            hide(dailyunfilled_star_4)
            hide(dailyunfilled_star_5)

            hideAllHalfStars()
            numStars = 5.0
        }
        else{
            show(dailyunfilled_star_5)

            show(dailyhalf_star_5)
            numStars = 4.5
        }
    }


    fun hide (imageView: ImageView) {
        imageView.visibility = GONE
    }

    fun show (imageView: ImageView) {
        imageView.visibility = VISIBLE
    }

    }


