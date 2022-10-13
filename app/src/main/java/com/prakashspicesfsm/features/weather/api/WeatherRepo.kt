package com.prakashspicesfsm.features.weather.api

import com.prakashspicesfsm.base.BaseResponse
import com.prakashspicesfsm.features.task.api.TaskApi
import com.prakashspicesfsm.features.task.model.AddTaskInputModel
import com.prakashspicesfsm.features.weather.model.ForeCastAPIResponse
import com.prakashspicesfsm.features.weather.model.WeatherAPIResponse
import io.reactivex.Observable

class WeatherRepo(val apiService: WeatherApi) {
    fun getCurrentWeather(zipCode: String): Observable<WeatherAPIResponse> {
        return apiService.getTodayWeather(zipCode)
    }

    fun getWeatherForecast(zipCode: String): Observable<ForeCastAPIResponse> {
        return apiService.getForecast(zipCode)
    }
}