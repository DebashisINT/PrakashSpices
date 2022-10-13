package com.prakashspicesfsm.features.dashboard.presentation.api.dayStartEnd

import com.prakashspicesfsm.features.stockCompetetorStock.api.AddCompStockApi
import com.prakashspicesfsm.features.stockCompetetorStock.api.AddCompStockRepository

object DayStartEndRepoProvider {
    fun dayStartRepositiry(): DayStartEndRepository {
        return DayStartEndRepository(DayStartEndApi.create())
    }

}