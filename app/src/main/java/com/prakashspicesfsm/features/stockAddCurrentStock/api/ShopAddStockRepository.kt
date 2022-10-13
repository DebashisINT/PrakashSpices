package com.prakashspicesfsm.features.stockAddCurrentStock.api

import com.prakashspicesfsm.base.BaseResponse
import com.prakashspicesfsm.features.location.model.ShopRevisitStatusRequest
import com.prakashspicesfsm.features.location.shopRevisitStatus.ShopRevisitStatusApi
import com.prakashspicesfsm.features.stockAddCurrentStock.ShopAddCurrentStockRequest
import com.prakashspicesfsm.features.stockAddCurrentStock.model.CurrentStockGetData
import com.prakashspicesfsm.features.stockCompetetorStock.model.CompetetorStockGetData
import io.reactivex.Observable

class ShopAddStockRepository (val apiService : ShopAddStockApi){
    fun shopAddStock(shopAddCurrentStockRequest: ShopAddCurrentStockRequest?): Observable<BaseResponse> {
        return apiService.submShopAddStock(shopAddCurrentStockRequest)
    }

    fun getCurrStockList(sessiontoken: String, user_id: String, date: String): Observable<CurrentStockGetData> {
        return apiService.getCurrStockListApi(sessiontoken, user_id, date)
    }

}