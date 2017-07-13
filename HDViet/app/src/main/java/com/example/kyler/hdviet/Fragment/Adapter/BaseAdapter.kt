package com.example.kyler.hdviet.Fragment.Adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.kyler.hdviet.Constants.ConstantsApi
import com.example.kyler.hdviet.Entities.Movie
import com.example.kyler.hdviet.R
import com.squareup.picasso.Picasso

/**
 * Created by kyler on 03/07/2017.
 */
class BaseAdapter(val context: Context, val listMovie: MutableList<Movie>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    constructor(context: Context ) : this(context, ArrayList<Movie>())

    private var onClicklistener : OnClickListener? = null

    fun setListMovies(listMovie: MutableList<Movie>){
        this.listMovie?.clear()
        this.listMovie?.addAll(listMovie)
        notifyDataSetChanged()
    }

    fun addListMovies(listMovie: List<Movie>){
        this.listMovie?.addAll(listMovie)
        notifyDataSetChanged()
    }

    fun setOnClickListener(onClickListener: OnClickListener){
        this.onClicklistener = onClickListener
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder?, position: Int) {
        if (holder is MoviewViewHolder) {
            val movieHolder = holder
            val movie : Movie? = listMovie?.get(position)
            movieHolder.movieName?.text = movie?.movieName
            movieHolder.imdbPoint?.text = movie?.imdbRating.toString()
            val url = ConstantsApi.Base.URL_IMAGE_POSTER + movie!!.newPoster
            Picasso.with(context).load(url)
                    .fit().into(movieHolder.movieImg)
            movieHolder.itemView.setOnClickListener {
                onClicklistener?.onClickListener(movie.movieID!!)
            }
        }
    }

    override fun getItemCount(): Int {
        return listMovie.size
    }

    override fun getItemViewType(position: Int): Int {
        return super.getItemViewType(position)
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): RecyclerView.ViewHolder {
        val inflater = LayoutInflater.from(parent?.context)
        return MoviewViewHolder(inflater.inflate(R.layout.movie_layout, parent, false))
    }

    interface OnClickListener {
        fun onClickListener(id : Int)
    }
}
