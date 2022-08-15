package com.dogpo.mvvmdemo.repository

import com.dogpo.mvvmdemo.model.TestData

interface EntriesRepository {
    suspend fun getEntries(): TestData
}
