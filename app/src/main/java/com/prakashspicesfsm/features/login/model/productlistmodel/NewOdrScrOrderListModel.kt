package com.prakashspicesfsm.features.login.model.productlistmodel

import com.prakashspicesfsm.app.domain.NewOrderScrOrderEntity
import com.prakashspicesfsm.app.domain.ProductListEntity

class NewOdrScrOrderListModel {
    var status:String? = null
    var message:String? = null
    var user_id:String? = null
    var order_list: ArrayList<NewOrderScrOrderEntity>? = null
}