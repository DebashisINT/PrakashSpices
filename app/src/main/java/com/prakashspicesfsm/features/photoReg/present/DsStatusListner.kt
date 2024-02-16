package com.prakashspicesfsm.features.photoReg.present

import com.prakashspicesfsm.app.domain.ProspectEntity
import com.prakashspicesfsm.features.photoReg.model.UserListResponseModel

interface DsStatusListner {
    fun getDSInfoOnLick(obj: ProspectEntity)
}