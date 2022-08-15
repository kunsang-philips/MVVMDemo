package com.dogpo.mvvmdemo.model

import com.google.gson.annotations.SerializedName

data class Entry(
    @SerializedName("API")
    val api: String,

    @SerializedName("Auth")
    val auth: String,

    @SerializedName("Category")
    val category: String,

    @SerializedName("Cors")
    val cors: String,

    @SerializedName("Description")
    val description: String,

    @SerializedName("HTTPS")
    val https: Boolean,

    @SerializedName("Link")
    val link: String
)
