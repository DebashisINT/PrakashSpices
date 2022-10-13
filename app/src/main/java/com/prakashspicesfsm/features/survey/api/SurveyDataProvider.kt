package com.prakashspicesfsm.features.survey.api

import com.prakashspicesfsm.features.photoReg.api.GetUserListPhotoRegApi
import com.prakashspicesfsm.features.photoReg.api.GetUserListPhotoRegRepository

object SurveyDataProvider{

    fun provideSurveyQ(): SurveyDataRepository {
        return SurveyDataRepository(SurveyDataApi.create())
    }

    fun provideSurveyQMultiP(): SurveyDataRepository {
        return SurveyDataRepository(SurveyDataApi.createImage())
    }
}