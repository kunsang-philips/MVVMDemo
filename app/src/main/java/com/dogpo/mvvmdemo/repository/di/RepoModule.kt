package com.dogpo.mvvmdemo.repository.di

import com.dogpo.mvvmdemo.api.TestApi
import com.dogpo.mvvmdemo.repository.EntriesRepository
import com.dogpo.mvvmdemo.repository.EntriesRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepoModule {
    @Singleton
    @Provides
    fun provideEntriesRepo(testApi: TestApi): EntriesRepository {
        return EntriesRepositoryImpl(testApi)
    }
}
