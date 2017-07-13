package com.example.kyler.hdviet.Fragment.Detail.About

import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.Toast
import com.example.kyler.hdviet.Activities.MovieDetail.MovieDetailActivity
import com.example.kyler.hdviet.Constants.Constants
import com.example.kyler.hdviet.Entities.MovieDetail
import com.example.kyler.hdviet.Fragment.BaseFragment
import com.example.kyler.hdviet.Fragment.Detail.Relative.Adapter.RelativeAdapter
import com.example.kyler.hdviet.R
import com.example.kyler.hdviet.Utils.GenUtils

/**
 * Created by kyler on 11/07/2017.
 */
class RelativeFragment: BaseFragment(){

    override fun getResLayout(): Int {
        return R.layout.recycler_view
    }

    override fun initView(view: View) {
        super.initView(view)
        val movieDetail = arguments.getSerializable(Constants.MOVIE_DETAIL_DATA) as MovieDetail
        val listRelative = movieDetail.relative
        val adapter = RelativeAdapter(activity, listRelative!!)
        adapter.setOnClickListener(object : RelativeAdapter.OnClickListener{
            override fun onClickListener(position: Int) {
                Toast.makeText(activity,"Movie name : ${adapter.relativeMovies[position].name}", Toast.LENGTH_SHORT).show()
            }
        })
        val recyclerView = view.findViewById(R.id.recyclerView) as RecyclerView
        recyclerView.layoutManager = GridLayoutManager(activity, 2)
        recyclerView.adapter = adapter
        recyclerView.isNestedScrollingEnabled = false
    }

    override fun toString(): String {
        return Constants.RELATIVE_TAG
    }
}