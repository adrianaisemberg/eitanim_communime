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
import com.eitanim.communime.api.requests.SignInRequests
import com.eitanim.communime.api.requests.SignUpRequests
import kotlinx.android.synthetic.main.activity_dailyrating.*

class DailyRatingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dailyrating)


        findViewById<Button>(R.id.dailyrating_button_1).setOnClickListener {
            DailyStar_1()
        }

        findViewById<Button>(R.id.dailyrating_button_2).setOnClickListener {
            DailyStar_2()
        }

        findViewById<Button>(R.id.dailyrating_button_3).setOnClickListener {
            DailyStar_3()
        }

        findViewById<Button>(R.id.dailyrating_button_4).setOnClickListener {
            DailyStar_4()
        }

        findViewById<Button>(R.id.dailyrating_button_5).setOnClickListener {
            DailyStar_5()
        }

    }

    private fun DailyStar_1() {
        hide(dailyunfilled_star_1)
        show(dailyunfilled_star_2)
        show(dailyunfilled_star_3)
        show(dailyunfilled_star_4)
        show(dailyunfilled_star_5)
    }

    private fun DailyStar_2() {
        hide(dailyunfilled_star_1)
        hide(dailyunfilled_star_2)
        show(dailyunfilled_star_3)
        show(dailyunfilled_star_4)
        show(dailyunfilled_star_5)
    }

    private fun DailyStar_3() {
        hide(dailyunfilled_star_1)
        hide(dailyunfilled_star_2)
        hide(dailyunfilled_star_3)
        show(dailyunfilled_star_4)
        show(dailyunfilled_star_5)
    }

    private fun DailyStar_4() {
        hide(dailyunfilled_star_1)
        hide(dailyunfilled_star_2)
        hide(dailyunfilled_star_3)
        hide(dailyunfilled_star_4)
        show(dailyunfilled_star_5)
    }

    private fun DailyStar_5() {
        hide(dailyunfilled_star_1)
        hide(dailyunfilled_star_2)
        hide(dailyunfilled_star_3)
        hide(dailyunfilled_star_4)
        hide(dailyunfilled_star_5)
    }


    fun hide (imageView: ImageView) {
        imageView.visibility = GONE
    }

    fun show (imageView: ImageView) {
        imageView.visibility = VISIBLE
    }

    }


