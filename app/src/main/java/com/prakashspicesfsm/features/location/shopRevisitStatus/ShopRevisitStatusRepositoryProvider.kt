package com.prakashspicesfsm.features.location.shopRevisitStatus

import com.prakashspicesfsm.features.location.shopdurationapi.ShopDurationApi
import com.prakashspicesfsm.features.location.shopdurationapi.ShopDurationRepository

object ShopRevisitStatusRepositoryProvider {
    fun provideShopRevisitStatusRepository(): ShopRevisitStatusRepository {
        return ShopRevisitStatusRepository(ShopRevisitStatusApi.create())
    }
}