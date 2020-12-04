package com.cronocode.intentrecyclerview.sign_up

import android.app.Application
import android.content.Context
import com.cronocode.intentrecyclerview.common.preferences.UserSession
import com.cronocode.intentrecyclerview.common.remote.ApiConstants
import com.cronocode.intentrecyclerview.common.remote.Networking
import com.cronocode.intentrecyclerview.sign_in.models.AuthRequest
import com.cronocode.intentrecyclerview.sign_up.models.SignUpRequest

class SignUpRepository(application: Application) {

    companion object {
        const val TAG = "SignUpRepository"
    }

    private val networkService =
        Networking.create(ApiConstants.APP_BASE_URL)

    suspend fun signUp(signUpRequest: SignUpRequest): String {
        val response = networkService.signUp(signUpRequest)
        return if (response.body()?.status=="success") {
            "OK"
        } else {
            response.body()?.error_description.toString()
        }
    }

}