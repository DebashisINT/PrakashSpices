package com.prakashspicesfsm.features.activities.api

import com.prakashspicesfsm.features.member.api.TeamApi
import com.prakashspicesfsm.features.member.api.TeamRepo

object ActivityRepoProvider {
    fun activityRepoProvider(): ActivityRepo {
        return ActivityRepo(ActivityApi.create())
    }

    fun activityImageRepoProvider(): ActivityRepo {
        return ActivityRepo(ActivityApi.createImage())
    }
}