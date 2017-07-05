package com.example.kyler.hdviet.Fragment.Populars

import com.example.kyler.hdviet.Constants.ConstantsURL
import com.example.kyler.hdviet.Fragment.BaseMoviesFragment.BaseRecyclerViewFragment

/**
 * Created by kyler on 09/06/2017.
 */
class PopularsFragment : BaseRecyclerViewFragment() {
    override fun getGenre(): ConstantsURL.Genre {
        return ConstantsURL.Genre.populars
    }

    override fun toString(): String {
        return "Populars"
    }

}