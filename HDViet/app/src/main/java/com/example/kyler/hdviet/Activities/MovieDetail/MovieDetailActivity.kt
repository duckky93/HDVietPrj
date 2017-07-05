package com.example.kyler.hdviet.Activities.MovieDetail

import android.widget.Toast
import com.example.kyler.hdviet.Activities.BaseActivity
import com.example.kyler.hdviet.Constants.ConstantsURL
import com.example.kyler.hdviet.Entities.MovieDetail
import com.example.kyler.hdviet.R

/**
 * Created by kyler on 05/07/2017.
 */
class MovieDetailActivity : BaseActivity(), IViewDetail {

    override fun getResLayout(): Int {
        return R.layout.activity_movie_detail
    }

    override fun initView() {
        super.initView()
        val presenter: MovieDetailPresenter = MovieDetailPresenter(this)
        presenter.attachView(this)
        presenter.getDetailMovie(intent.getIntExtra(ConstantsURL.ID_DATA, 0))
    }

    override fun onDetailResponse(movieDetail: MovieDetail) {
        Toast.makeText(this, "${movieDetail.movieID} is ${movieDetail.movieName}", Toast.LENGTH_SHORT).show()
    }
}