package com.prakashspicesfsm.features.newcollection.model

import com.prakashspicesfsm.app.domain.CollectionDetailsEntity
import com.prakashspicesfsm.base.BaseResponse
import com.prakashspicesfsm.features.shopdetail.presentation.model.collectionlist.CollectionListDataModel

/**
 * Created by Saikat on 15-02-2019.
 */
class NewCollectionListResponseModel : BaseResponse() {
    //var collection_list: ArrayList<CollectionListDataModel>? = null
    var collection_list: ArrayList<CollectionDetailsEntity>? = null
}