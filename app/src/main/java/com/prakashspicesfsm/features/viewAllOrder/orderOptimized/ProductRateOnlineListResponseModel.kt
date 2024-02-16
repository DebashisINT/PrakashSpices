package com.prakashspicesfsm.features.viewAllOrder.orderOptimized

import com.prakashspicesfsm.app.domain.ProductOnlineRateTempEntity
import com.prakashspicesfsm.base.BaseResponse
import com.prakashspicesfsm.features.login.model.productlistmodel.ProductRateDataModel
import java.io.Serializable

class ProductRateOnlineListResponseModel: BaseResponse(), Serializable {
    var product_rate_list: ArrayList<ProductOnlineRateTempEntity>? = null
}