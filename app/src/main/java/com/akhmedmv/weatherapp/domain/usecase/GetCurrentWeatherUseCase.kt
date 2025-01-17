package com.akhmedmv.weatherapp.domain.usecase

import com.akhmedmv.weatherapp.domain.repository.WeatherRepository
import javax.inject.Inject

class GetCurrentWeatherUseCase @Inject constructor(
    private val repository: WeatherRepository
) {

    suspend fun getWeather(cityId: Int) = repository.getWeather(cityId)

    suspend fun gerForecast(cityId: Int) = repository.getForecast(cityId)
}