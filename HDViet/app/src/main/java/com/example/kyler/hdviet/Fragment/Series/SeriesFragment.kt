package com.example.kyler.hdviet.Fragment.Series

import com.example.kyler.hdviet.Constants.ConstantsURL
import com.example.kyler.hdviet.Fragment.BaseMoviesFragment.BaseRecyclerViewFragment
import com.example.kyler.hdviet.Fragment.BaseMoviesFragment.IViewMovies

/**
 * Created by kyler on 09/06/2017.
 */
class SeriesFragment : BaseRecyclerViewFragment(), IViewMovies {
    override fun getGenre(): ConstantsURL.Genre {
        return ConstantsURL.Genre.series
    }

    override fun toString(): String {
        return "Series"
    }

}