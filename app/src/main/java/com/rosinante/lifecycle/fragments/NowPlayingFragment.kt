package com.rosinante.lifecycle.fragments


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.rosinante.lifecycle.R
import com.rosinante.lifecycle.adapter.RecyclerNowPlayingAdapter
import com.rosinante.lifecycle.model.NowPlayingModel
import com.rosinante.lifecycle.network.Apiservice
import com.rosinante.lifecycle.network.RetrofitConfig
import kotlinx.android.synthetic.main.fragment_now_playing.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


/**
 * A simple [Fragment] subclass.
 */
class NowPlayingFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        var view = inflater.inflate(R.layout.fragment_now_playing, container, false)
        getDataNowPlaying()
        return view
    }

    private fun getDataNowPlaying() {
        var apiservice = RetrofitConfig().getApiService()
        var call = apiservice.getNowPlaying("1b0b39b7699af0ca010cd87d9e6de6c8")
        call.enqueue(object : Callback<NowPlayingModel> {
            override fun onFailure(call: Call<NowPlayingModel>?, t: Throwable?) {

            }

            override fun onResponse(call: Call<NowPlayingModel>?, response: Response<NowPlayingModel>?) {

            }

        })
    }

}
