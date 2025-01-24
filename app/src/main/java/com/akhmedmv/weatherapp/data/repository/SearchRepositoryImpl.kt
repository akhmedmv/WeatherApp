package com.akhmedmv.weatherapp.data.repository

import com.akhmedmv.weatherapp.data.mapper.toEntities
import com.akhmedmv.weatherapp.data.network.api.ApiService
import com.akhmedmv.weatherapp.domain.entity.City
import com.akhmedmv.weatherapp.domain.repository.SearchRepository
import javax.inject.Inject

class SearchRepositoryImpl @Inject constructor(
    private val apiService: ApiService
) : SearchRepository {

    override suspend fun search(query: String): List<City> {
        return apiService.searchCity(query).toEntities()
    }
}