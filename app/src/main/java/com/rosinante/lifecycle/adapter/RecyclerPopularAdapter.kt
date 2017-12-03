package com.rosinante.lifecycle.adapter

import android.support.v4.app.FragmentActivity
import android.support.v7.widget.CardView
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.rosinante.lifecycle.R
import com.rosinante.lifecycle.model.PopularModel
import com.squareup.picasso.Picasso

/**
 * Created by Rosinante24 on 02/12/17.
 */
class RecyclerPopularAdapter : RecyclerView.Adapter<RecyclerPopularAdapter.ViewHolder> {

    var activity: FragmentActivity? = null
    var results: List<PopularModel.PopularData>? = null

    constructor(activity: FragmentActivity?, results: List<PopularModel.PopularData>?) : super() {
        this.activity = activity
        this.results = results
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.textreleasefilm.text = results?.get(position)!!.release_date
        holder.textnamafilm.text = results?.get(position)!!.title
        holder.textpopularity.text = "Popularity : " + results?.get(position)!!.popularity + " Peoples"
        Picasso.with(activity)
                .load("http://image.tmdb.org/t/p/w185" + results?.get(position)!!.poster_path)
                .placeholder(R.mipmap.ic_launcher_round)
                .into(holder.imagelist)
    }

    override fun getItemCount(): Int {
        return results!!.size
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        var view = LayoutInflater.from(activity).inflate(R.layout.movie_item, parent, false)
        return ViewHolder(view)
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imagelist = itemView.findViewById<ImageView>(R.id.imagelist) as ImageView
        var textnamafilm = itemView.findViewById<TextView>(R.id.textnamafilm) as TextView
        var textpopularity = itemView.findViewById<TextView>(R.id.textpopularityfilm) as TextView
        var textreleasefilm = itemView.findViewById<TextView>(R.id.textreleasefilm) as TextView
        var carditemfilm = itemView.findViewById<CardView>(R.id.cardviewmovie) as CardView
    }
}