package com.prakashspicesfsm.features.login.model.productlistmodel

import com.prakashspicesfsm.app.domain.ModelEntity
import com.prakashspicesfsm.app.domain.ProductListEntity
import com.prakashspicesfsm.base.BaseResponse

class ModelListResponse: BaseResponse() {
    var model_list: ArrayList<ModelEntity>? = null
}