package com.example.kyler.hdviet.Activities.MovieDetail

import com.example.kyler.hdviet.IBaseModel

/**
 * Created by kyler on 05/07/2017.
 */
interface IModelDetail : IBaseModel<IPresenterDetail>{
    fun getMovieDetail(headers: Map<String, String>, queries: Map<String, String>)
}