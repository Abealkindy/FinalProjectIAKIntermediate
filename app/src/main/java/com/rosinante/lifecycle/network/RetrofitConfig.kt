package com.rosinante.lifecycle.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Created by Rosinante24 on 02/12/17.
 */
class RetrofitConfig {
    private fun getRetrofit(): Retrofit {
        return Retrofit.Builder()
                .baseUrl("http://api.themoviedb.org/3/movie/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
    }

    fun getApiService(): Apiservice {
        return getRetrofit().create(Apiservice::class.java)
    }
}