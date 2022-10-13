package com.prakashspicesfsm.features.viewAllOrder.interf

import com.prakashspicesfsm.app.domain.NewOrderColorEntity
import com.prakashspicesfsm.app.domain.NewOrderProductEntity

interface ColorListNewOrderOnClick {
    fun productListOnClick(color: NewOrderColorEntity)
}