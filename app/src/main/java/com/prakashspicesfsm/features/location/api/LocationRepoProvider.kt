package com.prakashspicesfsm.features.location.api

import com.prakashspicesfsm.features.location.shopdurationapi.ShopDurationApi
import com.prakashspicesfsm.features.location.shopdurationapi.ShopDurationRepository


object LocationRepoProvider {
    fun provideLocationRepository(): LocationRepo {
        return LocationRepo(LocationApi.create())
    }
}