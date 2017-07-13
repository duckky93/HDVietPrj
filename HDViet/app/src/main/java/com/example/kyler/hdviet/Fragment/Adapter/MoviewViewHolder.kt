package com.example.kyler.hdviet.Fragment.Adapter

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.example.kyler.hdviet.R

/**
 * Created by kyler on 03/07/2017.
 */

class MoviewViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
    var movieImg : ImageView ?= null
    var movieName : TextView ?= null
    var imdbPoint : TextView ?= null
    init {
        movieImg = itemView.findViewById(R.id.movieImage) as ImageView
        movieName = itemView.findViewById(R.id.movieName) as TextView
        imdbPoint = itemView.findViewById(R.id.imdbPoint) as TextView
    }
}
