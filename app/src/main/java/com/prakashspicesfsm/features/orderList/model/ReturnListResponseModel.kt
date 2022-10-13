package com.prakashspicesfsm.features.orderList.model

import com.prakashspicesfsm.base.BaseResponse


class ReturnListResponseModel: BaseResponse() {
    var return_list: ArrayList<ReturnDataModel>? = null
}