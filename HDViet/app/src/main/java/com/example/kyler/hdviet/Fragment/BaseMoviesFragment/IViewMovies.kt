package com.example.kyler.hdviet.Fragment.BaseMoviesFragment

import com.example.kyler.hdviet.Entities.Movie
import com.example.kyler.hdviet.IBaseView

/**
 * Created by kyler on 30/06/2017.
 */
interface IViewMovies : IBaseView{

    fun onMovieResponse(listMovie : MutableList<Movie>)

}