package com.cronocode.intentrecyclerview.sign_up.models

import com.cronocode.intentrecyclerview.sign_in.models.DataModel
import com.google.gson.annotations.SerializedName

data class SignUpResponse(
    @SerializedName("status")
    val status: String,
    @SerializedName("error_description")
    val error_description: String
)