package com.isrodicoding.storyapp.di

import com.isrodicoding.storyapp.api.ApiConfig
import com.isrodicoding.storyapp.data.ListStoryRepository

object Injection {
    fun provideRepository(): ListStoryRepository {
        val apiService = ApiConfig.getApiService()
        return ListStoryRepository(apiService)
    }
}