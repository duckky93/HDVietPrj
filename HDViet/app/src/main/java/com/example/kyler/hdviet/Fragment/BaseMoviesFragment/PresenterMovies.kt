package com.example.kyler.hdviet.Fragment.BaseMoviesFragment

import android.content.Context
import com.example.kyler.hdviet.Constants.ConstantsURL
import com.example.kyler.hdviet.Entities.Movie

/**
 * Created by kyler on 30/06/2017.
 */
class PresenterMovies(val context: Context) : IPresenterMovies {

    var view : IViewMovies?=null
    var model : IModelMovies?=null

    init{
        model= ModelMovies(context)
        model?.attachPresenter(this)
    }

    override fun attachView(v: IViewMovies) {
        this.view = view
    }

    override fun onMovieResponse(listMovie: MutableList<Movie>) {
        view?.onMovieResponse(listMovie)
    }

    override fun getMovies(genre : ConstantsURL.Genre, page : Int) {
        val headers = HashMap<String, String>()
        val queries = HashMap<String, String>()
        headers.put(ConstantsURL.HeaderKeys.accessToken,"d2f08612c4164ec39e418020d5a5aa2e")
        queries.put(ConstantsURL.QueryKeys.genre, genre.key)
        queries.put(ConstantsURL.QueryKeys.tag, ConstantsURL.Tags.moi_cap_nhat.key)
        queries.put(ConstantsURL.QueryKeys.page, page.toString())
        queries.put(ConstantsURL.QueryKeys.limit, 30.toString())
        model?.getMovies(headers, queries)
    }
}