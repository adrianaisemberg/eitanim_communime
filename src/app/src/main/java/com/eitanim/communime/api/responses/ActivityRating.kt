package com.eitanim.communime.api.responses

data class ActivityRating(
    val id: String,
    val timeStamp: String,
    val userId: String,
    val activityName: String,
    val rating: Int
)