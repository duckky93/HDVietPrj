package com.example.kyler.hdviet.Fragment.Populars

import com.example.kyler.hdviet.Constants.Constants
import com.example.kyler.hdviet.Constants.ConstantsApi
import com.example.kyler.hdviet.Fragment.BaseMoviesFragment.BaseRecyclerViewFragment

/**
 * Created by kyler on 09/06/2017.
 */
class PopularsFragment : BaseRecyclerViewFragment() {
    override fun getGenre(): ConstantsApi.Genre {
        return ConstantsApi.Genre.populars
    }

    override fun toString(): String {
        return Constants.POPULAR_TAG
    }

}