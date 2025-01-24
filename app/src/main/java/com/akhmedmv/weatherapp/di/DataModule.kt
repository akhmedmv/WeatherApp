package com.akhmedmv.weatherapp.di

import android.content.Context
import com.akhmedmv.weatherapp.data.local.db.FavouriteCitiesDao
import com.akhmedmv.weatherapp.data.local.db.FavouriteDatabase
import com.akhmedmv.weatherapp.data.network.api.ApiFactory
import com.akhmedmv.weatherapp.data.network.api.ApiService
import com.akhmedmv.weatherapp.data.repository.FavouriteRepositoryImpl
import com.akhmedmv.weatherapp.data.repository.SearchRepositoryImpl
import com.akhmedmv.weatherapp.data.repository.WeatherRepositoryImpl
import com.akhmedmv.weatherapp.domain.repository.FavouriteRepository
import com.akhmedmv.weatherapp.domain.repository.SearchRepository
import com.akhmedmv.weatherapp.domain.repository.WeatherRepository
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
interface DataModule {

    @[ApplicationScope Binds]
    fun favouriteRepository(impl: FavouriteRepositoryImpl): FavouriteRepository

    @[ApplicationScope Binds]
    fun searchRepository(impl: SearchRepositoryImpl): SearchRepository

    @[ApplicationScope Binds]
    fun weatherRepository(impl: WeatherRepositoryImpl): WeatherRepository

    companion object {

        @[ApplicationScope Provides]
        fun provideApiService(): ApiService = ApiFactory.apiService

        @[ApplicationScope Provides]
        fun provideFavouriteDatabase(context: Context): FavouriteDatabase {
            return FavouriteDatabase.getInstance(context)
        }

        @[ApplicationScope Provides]
        fun provideFavouriteCitiesDao(database: FavouriteDatabase): FavouriteCitiesDao {
            return database.favouriteCitiesDao()
        }
    }
}