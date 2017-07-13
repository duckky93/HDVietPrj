package com.example.kyler.hdviet.Fragment.Detail.Relative.Adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.kyler.hdviet.Entities.MovieRelative
import com.example.kyler.hdviet.Fragment.Adapter.MoviewViewHolder
import com.example.kyler.hdviet.R
import com.squareup.picasso.Picasso

/**
 * Created by kyler on 12/07/2017.
 */
class RelativeAdapter(val context: Context, val relativeMovies: List<MovieRelative>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    constructor(context: Context) : this(context, ArrayList<MovieRelative>())

    private var onClicklistener: OnClickListener? = null

    fun setOnClickListener(onClickListener: OnClickListener) {
        this.onClicklistener = onClickListener
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder?, position: Int) {
        if (holder is MoviewViewHolder) {
            val movieHolder = holder
            val relativeMovie: MovieRelative = relativeMovies[position]
            movieHolder.movieName?.text = relativeMovie.name
            movieHolder.movieName?.textSize = context.resources.getDimension(R.dimen.text_normal) / context.resources.displayMetrics.density
            movieHolder.imdbPoint?.visibility = View.GONE
            val url = relativeMovie.poster
            Picasso.with(context).load(url)
                    .fit().into(movieHolder.movieImg)
            movieHolder.itemView.setOnClickListener {
                onClicklistener?.onClickListener(position)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): RecyclerView.ViewHolder {
        val inflater = LayoutInflater.from(parent?.context)
        return MoviewViewHolder(inflater.inflate(R.layout.movie_layout, parent, false))
    }

    override fun getItemCount(): Int {
        return relativeMovies.size
    }

    interface OnClickListener {
        fun onClickListener(position: Int)
    }
}