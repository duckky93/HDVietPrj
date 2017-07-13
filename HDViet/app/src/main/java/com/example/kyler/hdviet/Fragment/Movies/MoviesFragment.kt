package com.example.kyler.hdviet.Fragment.Movies

import com.example.kyler.hdviet.Constants.Constants
import com.example.kyler.hdviet.Constants.ConstantsApi
import com.example.kyler.hdviet.Fragment.BaseMoviesFragment.IViewMovies
import com.example.kyler.hdviet.Fragment.BaseMoviesFragment.BaseRecyclerViewFragment

/**
 * Created by kyler on 09/06/2017.
 */
class MoviesFragment : BaseRecyclerViewFragment(), IViewMovies {
    override fun getGenre(): ConstantsApi.Genre {
        return ConstantsApi.Genre.movies
    }

    override fun toString(): String {
        return Constants.MOVIE_TAG
    }

}