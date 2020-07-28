package com.eitanim.communime.api

import com.eitanim.communime.api.responses.ActivityRating
import okhttp3.Call
import retrofit2.http.GET

interface CommuniMeApi {

    @GET("/test")
    suspend fun test(): Call

    @GET("/api/activityrating")
    suspend fun activityRatings(): List<ActivityRating>
}