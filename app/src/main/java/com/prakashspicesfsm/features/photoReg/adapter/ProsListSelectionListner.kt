package com.prakashspicesfsm.features.photoReg.adapter

import com.prakashspicesfsm.features.photoReg.model.ProsCustom
import com.prakashspicesfsm.features.photoReg.model.UserListResponseModel

interface ProsListSelectionListner {
    fun getInfo(obj: ProsCustom)
}