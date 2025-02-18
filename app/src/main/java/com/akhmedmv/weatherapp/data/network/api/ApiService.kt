package com.akhmedmv.weatherapp.data.network.api

import com.akhmedmv.weatherapp.data.network.dto.CityDto
import com.akhmedmv.weatherapp.data.network.dto.WeatherCurrentDto
import com.akhmedmv.weatherapp.data.network.dto.WeatherForecastDto
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("current.json?key=")
    suspend fun loadCurrentWeather(
        @Query("q") query: String
    ): WeatherCurrentDto

    @GET("current.json?key=")
    suspend fun loadForecast(
        @Query("q") query: String,
        @Query("days") daysCount: Int = 4
    ): WeatherForecastDto

    @GET("search.json?key=")
    suspend fun searchCity(
        @Query("q") query: String,
    ): List<CityDto>
}