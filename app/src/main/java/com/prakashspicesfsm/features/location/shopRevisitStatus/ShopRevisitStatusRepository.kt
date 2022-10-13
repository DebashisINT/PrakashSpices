package com.prakashspicesfsm.features.location.shopRevisitStatus

import com.prakashspicesfsm.base.BaseResponse
import com.prakashspicesfsm.features.location.model.ShopDurationRequest
import com.prakashspicesfsm.features.location.model.ShopRevisitStatusRequest
import io.reactivex.Observable

class ShopRevisitStatusRepository(val apiService : ShopRevisitStatusApi) {
    fun shopRevisitStatus(shopRevisitStatus: ShopRevisitStatusRequest?): Observable<BaseResponse> {
        return apiService.submShopRevisitStatus(shopRevisitStatus)
    }
}