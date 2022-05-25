package com.ansela.kisahnabiapp.repo

import com.ansela.kisahnabiapp.model.ResponseMain
import com.ansela.kisahnabiapp.network.configNetwork
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.schedulers.Schedulers
import java.util.concurrent.ScheduledExecutorService

class RepositoryMain {

    fun getData(responhandler: (List<ResponseMain>) -> Unit, errorHandler: (Throwable) -> Unit){
        configNetwork.service().getData().subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                responhandler(it)
            },{
                errorHandler(it)
            })
    }
}