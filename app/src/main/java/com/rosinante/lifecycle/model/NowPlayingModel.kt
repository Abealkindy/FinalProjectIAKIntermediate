package com.rosinante.lifecycle.model

/**
 * Created by Rosinante24 on 02/12/17.
 */
class NowPlayingModel {
    lateinit var results: List<NowPlayingData>

    class NowPlayingData {
        var vote_count: Int? = null
        var vote_average: Long? = null
        lateinit var title: String
        var popularity: Int? = null
        lateinit var overview:String
        lateinit var poster_path: String
        lateinit var backdrop_path: String
        lateinit var release_date: String
    }
}