package com.cronocode.intentrecyclerview.common.remote


import com.cronocode.intentrecyclerview.sign_in.models.AuthRequest
import com.cronocode.intentrecyclerview.sign_in.models.AuthResponse
import com.cronocode.intentrecyclerview.sign_up.models.SignUpRequest
import com.cronocode.intentrecyclerview.sign_up.models.SignUpResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST


interface NetworkService {

    @POST(EndPoints.SIGN_IN)
    suspend fun signIn(@Body authRequest: AuthRequest): Response<AuthResponse>

    @POST(EndPoints.SIGN_UP)
    suspend fun signUp(@Body signUpRequest: SignUpRequest): Response<SignUpResponse>
}