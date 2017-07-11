package com.example.kyler.hdviet.Fragment.Detail.About

import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import com.example.kyler.hdviet.Constants.ConstantsURL
import com.example.kyler.hdviet.Entities.MovieDetail
import com.example.kyler.hdviet.Fragment.BaseFragment
import com.example.kyler.hdviet.R

/**
 * Created by kyler on 11/07/2017.
 */
class AboutFragment(val onLayoutChanged: OnLayoutChanged) : BaseFragment() {

    var layoutContainer: LinearLayout? = null

    override fun getResLayout(): Int {
        return R.layout.fragment_about
    }

    override fun initView(view: View) {
        super.initView(view)
        val movieDetail = arguments.getSerializable(ConstantsURL.MOVIE_DETAIL_DATA) as MovieDetail
        val tvMovieName = view.findViewById(R.id.tvMovieName) as TextView
        val tvMovieIMDB = view.findViewById(R.id.tvMovieIMDB) as TextView
        val tvMovieDescription = view.findViewById(R.id.tvMovieDescription) as TextView
        val tvMovieCountry = view.findViewById(R.id.tvMovieCountry) as TextView
        val tvMovieRelease = view.findViewById(R.id.tvMovieRelease) as TextView
        val tvMovieDirector = view.findViewById(R.id.tvMovieDirector) as TextView
        val tvMovieCreator = view.findViewById(R.id.tvMovieCreator) as TextView
        val tvMovieCast = view.findViewById(R.id.tvMovieCast) as TextView
        layoutContainer = view.findViewById(R.id.layoutContainer) as LinearLayout

        tvMovieName.text = "${movieDetail.movieName} (${movieDetail.knownAs})"
        tvMovieIMDB.text = getString(R.string.movie_IMDB, "${movieDetail.imdbRating}/10 (${movieDetail.imdbVotes})")
        tvMovieDescription.text = movieDetail.plotVI
        tvMovieCountry.text = getString(R.string.movie_country, movieDetail.country)
        tvMovieRelease.text = getString(R.string.movie_release, movieDetail.releaseDate)
        tvMovieDirector.text = getString(R.string.movie_director, movieDetail.director)
        tvMovieCreator.text = getString(R.string.movie_creator, movieDetail.creator)
        tvMovieCast.text = getString(R.string.movie_cast, movieDetail.cast?.replace(" / ", ", "))
    }

    override fun onResume() {
        super.onResume()
        val height = layoutContainer?.layoutParams?.height
        val width = layoutContainer?.layoutParams?.width
        onLayoutChanged.onLayoutChanged(layoutContainer?.layoutParams!!)
    }

    interface OnLayoutChanged {
        fun onLayoutChanged(layoutParams: ViewGroup.LayoutParams)
    }
}