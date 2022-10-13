package com.prakashspicesfsm.features.micro_learning.presentation

import android.app.IntentService
import android.content.Intent
import com.prakashspicesfsm.R
import com.prakashspicesfsm.app.NetworkConstant
import com.prakashspicesfsm.app.Pref
import com.prakashspicesfsm.app.utils.AppUtils
import com.prakashspicesfsm.app.utils.Toaster
import com.prakashspicesfsm.base.BaseResponse
import com.prakashspicesfsm.base.presentation.BaseActivity
import com.prakashspicesfsm.features.dashboard.presentation.DashboardActivity
import com.prakashspicesfsm.features.micro_learning.api.MicroLearningRepoProvider
import com.elvishew.xlog.XLog
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class FileOpeningTimeIntentService : IntentService("") {

    override fun onHandleIntent(p0: Intent?) {

        val id = p0?.getStringExtra("id")
        val startTime = p0?.getStringExtra("start_time")

        val repository = MicroLearningRepoProvider.microLearningRepoProvider()
        BaseActivity.compositeDisposable.add(
                repository.updateFileOpeningTime(id!!, startTime!!)
                        .subscribe({ result ->
                            val response = result as BaseResponse
                            XLog.d("UPDATE FILE OPENING TIME: " + "RESPONSE : " + response.status + "\n" + "Time : " + AppUtils.getCurrentDateTime() + ", USER :" + Pref.user_name + ",MESSAGE : " + response.message)
                        }, { error ->
                            XLog.d("UPDATE FILE OPENING TIME: " + "ERROR : " + "\n" + "Time : " + AppUtils.getCurrentDateTime() + ", USER :" + Pref.user_name + ",MESSAGE : " + error.localizedMessage)
                            error.printStackTrace()
                        })
        )
    }
}