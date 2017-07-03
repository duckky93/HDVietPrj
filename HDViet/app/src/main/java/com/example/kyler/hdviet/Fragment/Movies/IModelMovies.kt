package com.example.kyler.hdviet.Fragment.Movies

import android.content.Context
import com.example.kyler.hdviet.IBaseModel

/**
 * Created by kyler on 30/06/2017.
 */
interface IModelMovies : IBaseModel<IPresenterMovies> {
    fun getMovies(headers: Map<String, String>, queries: Map<String, String>)
}