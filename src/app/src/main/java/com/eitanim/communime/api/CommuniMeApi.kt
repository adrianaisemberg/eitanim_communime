package com.eitanim.communime.api

import com.eitanim.communime.api.requests.ActivityRatingsRequests
import com.eitanim.communime.api.requests.DailyRatingsRequests
import com.eitanim.communime.api.requests.SignInRequests
import com.eitanim.communime.api.requests.SignUpRequests
import com.eitanim.communime.api.responses.ActivityRating
import com.eitanim.communime.api.responses.DailyRatingResponse
import com.eitanim.communime.api.responses.LoginResponse
import com.eitanim.communime.api.responses.SignUpResponse
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface CommuniMeApi {

    @POST("/api/users")
    suspend fun signUp(@Body request: SignUpRequests): SignUpResponse

    @POST("/api/userlogin")
    suspend fun signIn(@Body request: SignInRequests): LoginResponse

    @POST("/api/dailyrating")
    suspend fun dailyRatings(@Body request: DailyRatingsRequests)

    @GET("/api/activityrating")
    suspend fun activityRatings(@Body request: ActivityRatingsRequests)//: List<ActivityRating>
}