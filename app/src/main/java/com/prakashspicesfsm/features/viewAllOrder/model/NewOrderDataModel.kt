package com.prakashspicesfsm.features.viewAllOrder.model

import com.prakashspicesfsm.app.domain.NewOrderColorEntity
import com.prakashspicesfsm.app.domain.NewOrderGenderEntity
import com.prakashspicesfsm.app.domain.NewOrderProductEntity
import com.prakashspicesfsm.app.domain.NewOrderSizeEntity
import com.prakashspicesfsm.features.stockCompetetorStock.model.CompetetorStockGetDataDtls

class NewOrderDataModel {
    var status:String ? = null
    var message:String ? = null
    var Gender_list :ArrayList<NewOrderGenderEntity>? = null
    var Product_list :ArrayList<NewOrderProductEntity>? = null
    var Color_list :ArrayList<NewOrderColorEntity>? = null
    var size_list :ArrayList<NewOrderSizeEntity>? = null
}

