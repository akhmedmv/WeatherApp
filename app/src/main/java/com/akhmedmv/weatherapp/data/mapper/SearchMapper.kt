package com.akhmedmv.weatherapp.data.mapper

import com.akhmedmv.weatherapp.data.network.dto.CityDto
import com.akhmedmv.weatherapp.domain.entity.City

fun CityDto.toEntity(): City = City(id, name, country)

fun List<CityDto>.toEntities(): List<City> = map { it.toEntity() }