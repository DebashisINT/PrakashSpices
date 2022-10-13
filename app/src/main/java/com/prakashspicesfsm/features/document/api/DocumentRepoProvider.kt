package com.prakashspicesfsm.features.document.api

import com.prakashspicesfsm.features.dymanicSection.api.DynamicApi
import com.prakashspicesfsm.features.dymanicSection.api.DynamicRepo

object DocumentRepoProvider {
    fun documentRepoProvider(): DocumentRepo {
        return DocumentRepo(DocumentApi.create())
    }

    fun documentRepoProviderMultipart(): DocumentRepo {
        return DocumentRepo(DocumentApi.createImage())
    }
}