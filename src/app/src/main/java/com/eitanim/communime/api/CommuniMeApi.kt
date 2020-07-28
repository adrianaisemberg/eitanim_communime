package com.eitanim.communime.api

import com.eitanim.communime.api.requests.SignInRequests
import com.eitanim.communime.api.requests.SignUpRequests
import com.eitanim.communime.api.responses.ActivityRating
import okhttp3.Call
import okhttp3.Request
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface CommuniMeApi {

    @POST("/api/users")
    suspend fun signUp(@Body request: SignUpRequests): Any

    @POST("/api/users")
    suspend fun signIn(@Body request: SignInRequests)

    @GET("/api/activityrating")
    suspend fun activityRatings(): List<ActivityRating>
}