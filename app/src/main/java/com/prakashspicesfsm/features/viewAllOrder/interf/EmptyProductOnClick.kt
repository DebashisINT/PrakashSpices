package com.prakashspicesfsm.features.viewAllOrder.interf

import com.prakashspicesfsm.features.viewAllOrder.model.ProductOrder

interface EmptyProductOnClick {
    fun emptyProductOnCLick(emptyFound:Boolean)
    fun delProductOnCLick(isDel:Boolean)
}