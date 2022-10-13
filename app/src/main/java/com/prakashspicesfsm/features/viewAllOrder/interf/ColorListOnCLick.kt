package com.prakashspicesfsm.features.viewAllOrder.interf

import com.prakashspicesfsm.app.domain.NewOrderGenderEntity
import com.prakashspicesfsm.features.viewAllOrder.model.ProductOrder

interface ColorListOnCLick {
    fun colorListOnCLick(size_qty_list: ArrayList<ProductOrder>, adpPosition:Int)
}