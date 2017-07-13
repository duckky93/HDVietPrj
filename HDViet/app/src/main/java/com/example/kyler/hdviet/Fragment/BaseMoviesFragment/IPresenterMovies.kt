package com.example.kyler.hdviet.Fragment.BaseMoviesFragment

import com.example.kyler.hdviet.Constants.ConstantsApi
import com.example.kyler.hdviet.Entities.Movie
import com.example.kyler.hdviet.IBasePresenter

/**
 * Created by kyler on 30/06/2017.
 */
interface IPresenterMovies : IBasePresenter<IViewMovies>{

    fun getMovies(genre : ConstantsApi.Genre, page : Int)

    fun onMovieResponse(listMovie : MutableList<Movie>)

}