package com.prakashspicesfsm.features.lead.api

import com.prakashspicesfsm.features.NewQuotation.api.GetQuotListRegRepository
import com.prakashspicesfsm.features.NewQuotation.api.GetQutoListApi


object GetLeadRegProvider {
    fun provideList(): GetLeadListRegRepository {
        return GetLeadListRegRepository(GetLeadListApi.create())
    }
}