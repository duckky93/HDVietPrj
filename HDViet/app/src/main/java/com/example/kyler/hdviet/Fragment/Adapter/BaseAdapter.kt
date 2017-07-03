package com.example.kyler.hdviet.Fragment.Adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.kyler.hdviet.Constants.ConstantsURL
import com.example.kyler.hdviet.Entities.Movie
import com.example.kyler.hdviet.R
import com.squareup.picasso.Picasso

/**
 * Created by kyler on 03/07/2017.
 */
class BaseAdapter(context: Context, listMovie: List<Movie>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private var listMovie: List<Movie>? = null
    private var context: Context? = null

    init {
        this.listMovie = listMovie
        this.context = context
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder?, position: Int) {
        if (holder is MoviewViewHolder) {
            val movieHolder = holder
            val movie : Movie? = listMovie?.get(position)
            movieHolder.movieName?.text = movie?.movieName
            val url = ConstantsURL.Base.URL_IMAGE_POSTER + movie!!.newPoster
            Picasso.with(context).load(url)
                    .fit().into(movieHolder.movieImg)
        }
    }

    override fun getItemCount(): Int {
        return listMovie!!.size
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): RecyclerView.ViewHolder {
        val inflater = LayoutInflater.from(parent?.context)
        return MoviewViewHolder(inflater.inflate(R.layout.movie_layout, parent, false))
    }


}
