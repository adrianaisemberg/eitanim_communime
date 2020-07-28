package com.eitanim.communime.api.requests

data class SignUpRequests(
val name: String,
val email: String,
val passwordhash: String
)