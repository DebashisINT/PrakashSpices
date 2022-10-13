package com.prakashspicesfsm.features.newcollectionreport

import com.prakashspicesfsm.features.photoReg.model.UserListResponseModel

interface PendingCollListner {
    fun getUserInfoOnLick(obj: PendingCollData)
}