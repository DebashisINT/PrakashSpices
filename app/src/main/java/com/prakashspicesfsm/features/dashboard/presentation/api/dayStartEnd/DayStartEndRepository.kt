package com.prakashspicesfsm.features.dashboard.presentation.api.dayStartEnd

import com.prakashspicesfsm.app.Pref
import com.prakashspicesfsm.base.BaseResponse
import com.prakashspicesfsm.features.dashboard.presentation.model.DaystartDayendRequest
import com.prakashspicesfsm.features.dashboard.presentation.model.StatusDayStartEnd
import com.prakashspicesfsm.features.stockCompetetorStock.ShopAddCompetetorStockRequest
import com.prakashspicesfsm.features.stockCompetetorStock.api.AddCompStockApi
import io.reactivex.Observable

class DayStartEndRepository (val apiService: DayStartEndApi){
    fun dayStart(daystartDayendRequest: DaystartDayendRequest): Observable<BaseResponse> {
        return apiService.submitDayStartEnd(daystartDayendRequest)
    }

    fun dayStartEndStatus(date:String): Observable<StatusDayStartEnd> {
        return apiService.statusDayStartEnd(Pref.session_token!!, Pref.user_id!!,date)
    }


}