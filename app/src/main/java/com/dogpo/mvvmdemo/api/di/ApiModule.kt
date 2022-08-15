package com.dogpo.mvvmdemo.api.di

import com.dogpo.mvvmdemo.api.TestApi
import com.google.gson.GsonBuilder
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object ApiModule {
    @Singleton
    @Provides
    fun provideEntriesApi(retrofit: Retrofit): TestApi {
        return retrofit.create(TestApi::class.java)
    }

    @Singleton
    @Provides
    fun provideRetrofit(okHttpClient: OkHttpClient): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://api.publicapis.org/")
            .client(okHttpClient)
            .addConverterFactory(
                GsonConverterFactory.create(GsonBuilder().create())
            ).build()
    }

    @Singleton
    @Provides
    fun provideOkHttpClient(): OkHttpClient {
        return OkHttpClient().newBuilder().build()
    }
}
