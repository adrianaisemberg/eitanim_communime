package com.eitanim.communime

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.eitanim.communime.api.CommuniMeService

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        async_io {
            test()
        }
    }

    private suspend fun test() {
        val list = CommuniMeService.api().activityRatings()
    }
}