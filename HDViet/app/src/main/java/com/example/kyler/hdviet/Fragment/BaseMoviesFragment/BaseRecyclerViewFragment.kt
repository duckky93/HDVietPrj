package com.example.kyler.hdviet.Fragment.BaseMoviesFragment

import android.content.Intent
import android.os.Handler
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.View
import com.example.kyler.hdviet.Activities.MovieDetail.MovieDetailActivity
import com.example.kyler.hdviet.Constants.Constants
import com.example.kyler.hdviet.Constants.ConstantsApi
import com.example.kyler.hdviet.Entities.Movie
import com.example.kyler.hdviet.Fragment.Adapter.BaseAdapter
import com.example.kyler.hdviet.Fragment.BaseFragment
import com.example.kyler.hdviet.R

/**
 * Created by kyler on 04/07/2017.
 */
abstract class BaseRecyclerViewFragment : BaseFragment(), IViewMovies {

    var recyclerView: RecyclerView? = null
    var isLoading: Boolean? = false
    var page: Int? = 1
    var presenter: PresenterMovies? = null
    var adapter: BaseAdapter? = null

    abstract fun getGenre(): ConstantsApi.Genre

    fun onLoadingOnPage(page: Int) {
        presenter?.getMovies(getGenre(), page!!)
    }


    override fun onMovieResponse(listMovie: MutableList<Movie>) {
        if (recyclerView?.adapter == null) {
            recyclerView?.adapter = adapter
            page = 1
        }
        if (page == 1) {
            adapter?.setListMovies(listMovie)
        } else {
            adapter?.addListMovies(listMovie)
        }
    }

    override fun getResLayout(): Int {
        return R.layout.fragment_movies
    }

    override fun initView(view: View) {
        super.initView(view)
        recyclerView = view.findViewById(R.id.recyclerView) as RecyclerView
        adapter = BaseAdapter(activity)
        presenter = PresenterMovies(context)
        recyclerView?.layoutManager = GridLayoutManager(activity, 3) as RecyclerView.LayoutManager?
        recyclerView?.addOnScrollListener(object : RecyclerView.OnScrollListener() {
            override fun onScrolled(recyclerView: RecyclerView?, dx: Int, dy: Int) {
                if (isLoading!!) {
                    return
                }
                val layoutManager = recyclerView?.layoutManager as GridLayoutManager
                val visibleItemCount = layoutManager.childCount
                val totalItemCount = layoutManager.itemCount
                val pastVisibleItems = layoutManager.findFirstVisibleItemPosition()
                if (pastVisibleItems + visibleItemCount >= totalItemCount) {
                    onLoadMore()
                }
            }
        })
        adapter?.setOnClickListener(object : BaseAdapter.OnClickListener {
            override fun onClickListener(id: Int) {
                val intent = Intent(activity, MovieDetailActivity::class.java)
                intent.putExtra(Constants.ID_DATA, id)
                activity.startActivity(intent)
            }
        })
        presenter?.attachView(this)
        presenter?.getMovies(getGenre(), 1)
    }

    fun onLoadMore() {
        isLoading = true
        val handler: Handler = Handler()
        handler.postDelayed({
            page = page!! + 1
            onLoadingOnPage(page!!)
            Log.e("PageLoading", "page : $page")
            isLoading = false
        }, 300)
    }
}