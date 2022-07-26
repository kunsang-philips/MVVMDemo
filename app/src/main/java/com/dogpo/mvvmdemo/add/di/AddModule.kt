package com.dogpo.mvvmdemo.add.di

import com.dogpo.mvvmdemo.add.Add
import com.dogpo.mvvmdemo.add.AddImpl2
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
object AddModule {
    @Provides
    fun provideAdd(): Add {
        return AddImpl2()
    }
}
