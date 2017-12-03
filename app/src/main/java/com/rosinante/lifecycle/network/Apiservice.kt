package com.rosinante.lifecycle.network

import com.rosinante.lifecycle.model.NowPlayingModel
import com.rosinante.lifecycle.model.PopularModel
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Created by Rosinante24 on 02/12/17.
 */
interface Apiservice {

    @GET("popular")
    fun getPopular(
            @Query("api_key") apikey: String
    ): Call<PopularModel>

    @GET("now_playing")
    fun getNowPlaying(
            @Query("api_key") apikey: String
    ): Call<NowPlayingModel>

}