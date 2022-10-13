package com.prakashspicesfsm.features.viewAllOrder.interf

import com.prakashspicesfsm.app.domain.NewOrderGenderEntity
import com.prakashspicesfsm.features.viewAllOrder.model.ProductOrder
import java.text.FieldPosition

interface NewOrderSizeQtyDelOnClick {
    fun sizeQtySelListOnClick(product_size_qty: ArrayList<ProductOrder>)
    fun sizeQtyListOnClick(product_size_qty: ProductOrder,position: Int)
}