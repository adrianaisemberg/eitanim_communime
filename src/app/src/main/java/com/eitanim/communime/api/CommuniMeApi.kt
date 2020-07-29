package com.eitanim.communime.api

import com.eitanim.communime.api.requests.DailyRatingsRequests
import com.eitanim.communime.api.requests.SignInRequests
import com.eitanim.communime.api.requests.SignUpRequests
import com.eitanim.communime.api.responses.ActivityRating
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface CommuniMeApi {

    @POST("/api/users")
    suspend fun signUp(@Body request: SignUpRequests)

    @POST("/api/userslogin")
    suspend fun signIn(@Body request: SignInRequests): Any

    @POST("/api/dailyrating?")
    suspend fun dailyRatings(@Body request: DailyRatingsRequests)

    @GET("/api/activityrating")
    suspend fun activityRatings(): List<ActivityRating>
}