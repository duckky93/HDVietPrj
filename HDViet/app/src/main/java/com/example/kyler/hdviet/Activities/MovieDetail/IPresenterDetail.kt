package com.example.kyler.hdviet.Activities.MovieDetail

import com.example.kyler.hdviet.Entities.MovieDetail
import com.example.kyler.hdviet.IBasePresenter

/**
 * Created by kyler on 05/07/2017.
 */
interface IPresenterDetail : IBasePresenter<IViewDetail>{
    fun getDetailMovie(id : Int)
    fun onDetailResponse(movieDetail : MovieDetail)
}