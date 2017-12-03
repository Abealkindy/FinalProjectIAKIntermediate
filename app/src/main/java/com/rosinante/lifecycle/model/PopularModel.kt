package com.rosinante.lifecycle.model

/**
 * Created by Rosinante24 on 02/12/17.
 */
class PopularModel {
    lateinit var results: List<PopularData>

    class PopularData {
        var vote_count: Int? = null
        var vote_average: Long? = null
        lateinit var title: String
        var popularity: Int? = null
        lateinit var overview: String
        lateinit var poster_path: String
        lateinit var backdrop_path: String
        lateinit var release_date: String
    }
}