package com.prakashspicesfsm.features.weather.api

import com.prakashspicesfsm.features.task.api.TaskApi
import com.prakashspicesfsm.features.task.api.TaskRepo

object WeatherRepoProvider {
    fun weatherRepoProvider(): WeatherRepo {
        return WeatherRepo(WeatherApi.create())
    }
}