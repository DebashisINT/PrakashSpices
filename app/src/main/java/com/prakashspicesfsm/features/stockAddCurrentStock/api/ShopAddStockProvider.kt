package com.prakashspicesfsm.features.stockAddCurrentStock.api

import com.prakashspicesfsm.features.location.shopRevisitStatus.ShopRevisitStatusApi
import com.prakashspicesfsm.features.location.shopRevisitStatus.ShopRevisitStatusRepository

object ShopAddStockProvider {
    fun provideShopAddStockRepository(): ShopAddStockRepository {
        return ShopAddStockRepository(ShopAddStockApi.create())
    }
}