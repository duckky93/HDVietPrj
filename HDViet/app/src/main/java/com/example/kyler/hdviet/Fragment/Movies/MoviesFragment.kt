package com.example.kyler.hdviet.Fragment.Movies

import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.View
import com.example.kyler.hdviet.Entities.Movie
import com.example.kyler.hdviet.Fragment.Adapter.BaseAdapter
import com.example.kyler.hdviet.Fragment.BaseFragment
import com.example.kyler.hdviet.R
import kotlinx.android.synthetic.main.recycler_view.*

/**
 * Created by kyler on 09/06/2017.
 */
class MoviesFragment : BaseFragment(), IViewMovies{

    var rec : RecyclerView ?= null

    override fun onMovieResponse(listMovie: List<Movie>) {
        val adapter = BaseAdapter(activity,listMovie)
        rec?.adapter = adapter
    }

    override fun getResLayout(): Int {
        return R.layout.fragment_movies
    }

    override fun initView(view : View) {
        super.initView(view)
        rec = view.findViewById(R.id.recyclerView) as RecyclerView
        rec?.layoutManager = GridLayoutManager(activity,3)
        val presenter = PresenterMovies(context)
        presenter.view = this
        presenter.getMovies()
    }

    override fun toString(): String {
        return "Movies"
    }

}