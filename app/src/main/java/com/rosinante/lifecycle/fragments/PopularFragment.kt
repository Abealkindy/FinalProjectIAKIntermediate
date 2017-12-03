package com.rosinante.lifecycle.fragments


import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.rosinante.lifecycle.R
import com.rosinante.lifecycle.adapter.RecyclerPopularAdapter
import com.rosinante.lifecycle.model.PopularModel
import com.rosinante.lifecycle.network.RetrofitConfig
import kotlinx.android.synthetic.main.fragment_popular.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


/**
 * A simple [Fragment] subclass.
 */
class PopularFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        var view = inflater.inflate(R.layout.fragment_popular, container, false)
        getDataPopular()
        return view
    }

    private fun getDataPopular() {
        var apiservice = RetrofitConfig().getApiService()
        var call = apiservice.getPopular("1b0b39b7699af0ca010cd87d9e6de6c8")
        call.enqueue(object : Callback<PopularModel> {
            override fun onFailure(call: Call<PopularModel>?, t: Throwable?) {
            }

            override fun onResponse(call: Call<PopularModel>?, response: Response<PopularModel>) {
                recyclerPopular.layoutManager = LinearLayoutManager(activity)
                recyclerPopular.adapter = RecyclerPopularAdapter(activity, response.body()!!.results)
            }

        })
    }
}
