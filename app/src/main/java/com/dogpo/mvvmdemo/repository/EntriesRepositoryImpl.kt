package com.dogpo.mvvmdemo.repository

import com.dogpo.mvvmdemo.api.TestApi
import com.dogpo.mvvmdemo.model.TestData

class EntriesRepositoryImpl(private val testApi: TestApi) : EntriesRepository {
    override suspend fun getEntries(): TestData {
        return testApi.getEntry()
    }
}
