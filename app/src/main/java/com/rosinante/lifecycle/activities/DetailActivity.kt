package com.rosinante.lifecycle.activities

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.rosinante.lifecycle.R
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_detail.*
import kotlinx.android.synthetic.main.content_detail.*

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        setSupportActionBar(toolbar)
        var title = intent.getStringExtra("titlemovie")
        var releasedate = intent.getStringExtra("textrelease")
        var popularity = intent.getDoubleExtra("textpopularity", 0.0)
        var imagebackgrounds = intent.getStringExtra("imagebackground")
        var textoverview = intent.getStringExtra("textoverview")
        var voteCount = intent.getIntExtra("votecount", 0)
        var voteAverage = intent.getDoubleExtra("voteaverage", 0.0)

        toolbar_layout.title = title
        Picasso.with(applicationContext)
                .load(imagebackgrounds)
                .placeholder(R.mipmap.ic_launcher_round)
                .into(imagebackground)

        textDetail.text = releasedate + "\n\n"
        textDetail.append("Popularity : $popularity Peoples\n\n")
        textDetail.append("" + voteCount + "\n\n")
        textDetail.append(textoverview)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}
