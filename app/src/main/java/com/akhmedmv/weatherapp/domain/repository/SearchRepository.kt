package com.akhmedmv.weatherapp.domain.repository

import com.akhmedmv.weatherapp.domain.entity.City

interface SearchRepository {

    suspend fun search(query: String): List<City>
}