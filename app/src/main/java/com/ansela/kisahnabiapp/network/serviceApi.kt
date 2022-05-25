package com.ansela.kisahnabiapp.network

import com.ansela.kisahnabiapp.model.ResponseMain
import io.reactivex.rxjava3.core.Flowable
import retrofit2.http.GET

interface serviceApi {

    @GET("api/kisahnabi")
    fun getData(): Flowable<List<ResponseMain>>
}