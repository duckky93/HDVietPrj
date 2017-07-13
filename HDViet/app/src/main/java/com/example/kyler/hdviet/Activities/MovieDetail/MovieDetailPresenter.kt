package com.example.kyler.hdviet.Activities.MovieDetail

import android.content.Context
import com.example.kyler.hdviet.Constants.ConstantsApi
import com.example.kyler.hdviet.Entities.MovieDetail

/**
 * Created by kyler on 05/07/2017.
 */
class MovieDetailPresenter(val context: Context) : IPresenterDetail {

    var model: IModelDetail? = null
    var view: IViewDetail? = null

    init {
        model = MovieDetailModel(context)
        model?.attachPresenter(this)
    }

    override fun attachView(v: IViewDetail) {
        this.view = v
    }

    override fun getDetailMovie(id: Int) {
        val headers = HashMap<String, String>()
        val queries = HashMap<String, String>()
        queries.put(ConstantsApi.QueryKeys.movieId, id.toString())
        model?.getMovieDetail(headers, queries)
    }

    override fun onDetailResponse(movieDetail: MovieDetail) {
        view?.onDetailResponse(movieDetail)
    }
}