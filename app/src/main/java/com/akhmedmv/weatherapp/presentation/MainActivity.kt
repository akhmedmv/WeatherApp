package com.akhmedmv.weatherapp.presentation

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.akhmedmv.weatherapp.data.network.api.ApiFactory
import com.akhmedmv.weatherapp.presentation.ui.theme.WeatherAppTheme
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val apiService = ApiFactory.apiService
        CoroutineScope(Dispatchers.Main).launch {
            val currentWeather = apiService.loadCurrentWeather("London")
            val forecastWeather = apiService.loadForecast("London")
            val cities = apiService.searchCity("London")
            Log.d(
                "MainActivity",
                "Current Weather $currentWeather\nForecast Weather $forecastWeather\nCities $cities"
            )
        }
        setContent {
            WeatherAppTheme {

            }
        }
    }
}