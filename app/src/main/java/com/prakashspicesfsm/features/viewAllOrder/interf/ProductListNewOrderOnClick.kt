package com.prakashspicesfsm.features.viewAllOrder.interf

import com.prakashspicesfsm.app.domain.NewOrderGenderEntity
import com.prakashspicesfsm.app.domain.NewOrderProductEntity

interface ProductListNewOrderOnClick {
    fun productListOnClick(product: NewOrderProductEntity)
}