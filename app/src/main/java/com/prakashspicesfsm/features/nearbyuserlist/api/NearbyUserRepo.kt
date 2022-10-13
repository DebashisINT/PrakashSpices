package com.prakashspicesfsm.features.nearbyuserlist.api

import com.prakashspicesfsm.app.Pref
import com.prakashspicesfsm.features.nearbyuserlist.model.NearbyUserResponseModel
import com.prakashspicesfsm.features.newcollection.model.NewCollectionListResponseModel
import com.prakashspicesfsm.features.newcollection.newcollectionlistapi.NewCollectionListApi
import io.reactivex.Observable

class NearbyUserRepo(val apiService: NearbyUserApi) {
    fun nearbyUserList(): Observable<NearbyUserResponseModel> {
        return apiService.getNearbyUserList(Pref.session_token!!, Pref.user_id!!)
    }
}