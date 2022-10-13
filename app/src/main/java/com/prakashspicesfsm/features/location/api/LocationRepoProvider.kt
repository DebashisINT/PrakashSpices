package com.prakashspicesfsm.features.location.api

import com.prakashspicesfsm.features.location.shopdurationapi.ShopDurationApi
import com.prakashspicesfsm.features.location.shopdurationapi.ShopDurationRepository

/**
 * Created by Saikat on 17-Aug-20.
 */
object LocationRepoProvider {
    fun provideLocationRepository(): LocationRepo {
        return LocationRepo(LocationApi.create())
    }
}