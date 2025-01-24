package com.akhmedmv.weatherapp

import android.app.Application
import com.akhmedmv.weatherapp.di.ApplicationComponent
import com.akhmedmv.weatherapp.di.DaggerApplicationComponent

class WeatherApp : Application() {

    lateinit var application: ApplicationComponent

    override fun onCreate() {
        super.onCreate()
        application = DaggerApplicationComponent.factory().create(this)
    }
}