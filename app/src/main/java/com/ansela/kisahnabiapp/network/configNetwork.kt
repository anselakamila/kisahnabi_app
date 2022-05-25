package com.ansela.kisahnabiapp.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object configNetwork {
    fun getRetrofit(): Retrofit{
        return  Retrofit
            .Builder()
            .baseUrl("https://islamic-api-zhirrr.vercel.app/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
    fun service(): serviceApi = getRetrofit().create(serviceApi::class.java)
}