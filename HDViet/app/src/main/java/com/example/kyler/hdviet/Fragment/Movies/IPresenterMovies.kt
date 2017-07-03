package com.example.kyler.hdviet.Fragment.Movies

import com.example.kyler.hdviet.Entities.Movie
import com.example.kyler.hdviet.IBasePresenter

/**
 * Created by kyler on 30/06/2017.
 */
interface IPresenterMovies : IBasePresenter<IViewMovies>{
    fun getMovies()
    fun onMovieResponse(listMovie : List<Movie>)
}