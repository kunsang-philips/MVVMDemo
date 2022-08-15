package com.dogpo.mvvmdemo.api

import com.dogpo.mvvmdemo.model.TestData
import retrofit2.http.GET

interface TestApi {
    @GET("entries")
    suspend fun getEntry(): TestData
}
