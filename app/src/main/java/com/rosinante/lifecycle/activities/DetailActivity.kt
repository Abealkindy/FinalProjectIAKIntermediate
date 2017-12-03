package com.rosinante.lifecycle.activities

import android.os.Bundle
import android.support.design.widget.Snackbar
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
        var popularity = intent.getIntExtra("textpopularity", 0)
        var imagebackgrounds = intent.getStringExtra("imagebackground")
        var textoverview = intent.getStringExtra("textoverview")
        var voteCount = intent.getIntExtra("votecount", 0)
        var voteAverage = intent.getLongExtra("voteaverage", 0)

        toolbar.title = title
        Picasso.with(applicationContext)
                .load(imagebackgrounds)
                .placeholder(R.mipmap.ic_launcher_round)
                .into(imagebackground)

        textDetail.text = releasedate + "\n\n"
        textDetail.append(popularity.toString() + "\n\n")
        textDetail.append(voteCount.toString() + "\n\n")
        textDetail.append(textoverview)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}
