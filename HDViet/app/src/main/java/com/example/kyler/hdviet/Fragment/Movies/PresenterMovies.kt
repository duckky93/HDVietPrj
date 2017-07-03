package com.example.kyler.hdviet.Fragment.Movies

import android.content.Context
import com.example.kyler.hdviet.Constants.ConstantsURL
import com.example.kyler.hdviet.Entities.Movie

/**
 * Created by kyler on 30/06/2017.
 */
class PresenterMovies(context: Context) : IPresenterMovies{

    override fun onMovieResponse(listMovie: List<Movie>) {
        view?.onMovieResponse(listMovie)
    }

    var view : IViewMovies?=null
    var model : IModelMovies?=null

    init{
        model= ModelMovies(context)
        model?.attachPresenter(this)
    }

    override fun getMovies() {
        val headers = HashMap<String, String>()
        val queries = HashMap<String, String>()
        headers.put(ConstantsURL.HeaderKeys.accessToken,"d2f08612c4164ec39e418020d5a5aa2e")
        queries.put(ConstantsURL.QueryKeys.genre,ConstantsURL.Genre.populars.toString())
        queries.put(ConstantsURL.QueryKeys.tag,ConstantsURL.Tags.moi_cap_nhat)
        queries.put(ConstantsURL.QueryKeys.page,1.toString())
        queries.put(ConstantsURL.QueryKeys.limit,100.toString())
        model?.getMovies(headers, queries)
    }
}