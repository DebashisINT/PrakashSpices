package com.prakashspicesfsm.features.viewAllOrder.interf

import com.prakashspicesfsm.app.domain.NewOrderProductEntity
import com.prakashspicesfsm.app.domain.NewOrderSizeEntity

interface SizeListNewOrderOnClick {
    fun sizeListOnClick(size: NewOrderSizeEntity)
}