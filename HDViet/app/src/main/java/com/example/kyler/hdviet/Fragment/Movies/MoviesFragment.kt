package com.example.kyler.hdviet.Fragment.Movies

import com.example.kyler.hdviet.Constants.ConstantsURL
import com.example.kyler.hdviet.Fragment.BaseMoviesFragment.IViewMovies
import com.example.kyler.hdviet.Fragment.BaseMoviesFragment.BaseRecyclerViewFragment

/**
 * Created by kyler on 09/06/2017.
 */
class MoviesFragment : BaseRecyclerViewFragment(), IViewMovies {
    override fun getGenre(): ConstantsURL.Genre {
        return ConstantsURL.Genre.movies
    }

    override fun toString(): String {
        return "Movies"
    }

}