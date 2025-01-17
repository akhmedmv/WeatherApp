package com.akhmedmv.weatherapp.domain.repository

import com.akhmedmv.weatherapp.domain.entity.Forecast
import com.akhmedmv.weatherapp.domain.entity.Weather

interface WeatherRepository {

    suspend fun getWeather(cityId: Int): Weather

    suspend fun getForecast(cityId: Int): Forecast
}