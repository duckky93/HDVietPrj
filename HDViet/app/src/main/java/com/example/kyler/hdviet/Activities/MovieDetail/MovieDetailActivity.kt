package com.example.kyler.hdviet.Activities.MovieDetail

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.kyler.hdviet.Activities.BaseActivity
import com.example.kyler.hdviet.Constants.ConstantsURL
import com.example.kyler.hdviet.Entities.MovieDetail
import com.example.kyler.hdviet.Fragment.BaseFragment
import com.example.kyler.hdviet.Fragment.Detail.About.AboutFragment
import com.example.kyler.hdviet.Fragment.Movies.MoviesFragment
import com.example.kyler.hdviet.Fragment.Populars.PopularsFragment
import com.example.kyler.hdviet.Fragment.Series.SeriesFragment
import com.example.kyler.hdviet.R
import com.google.android.youtube.player.*
import kotlinx.android.synthetic.main.activity_movie_detail.*
import com.google.android.youtube.player.YouTubeThumbnailView
import com.google.android.youtube.player.YouTubeThumbnailLoader
import com.google.android.youtube.player.YouTubePlayerSupportFragment
import kotlinx.android.synthetic.main.layout_content_main.*


/**
 * Created by kyler on 05/07/2017.
 */
class MovieDetailActivity : BaseActivity(), IViewDetail {

    override fun getResLayout(): Int {
        return R.layout.activity_movie_detail
    }

    override fun initView() {
        val presenter: MovieDetailPresenter = MovieDetailPresenter(this)
        presenter.attachView(this)
        presenter.getDetailMovie(intent.getIntExtra(ConstantsURL.ID_DATA, 0))
    }

    override fun onDetailResponse(movieDetail: MovieDetail) {
        val youtubeVideoKey = movieDetail.trailer?.split("watch?v=")?.get(1)
        youtubethumbnailview.initialize("AIzaSyChhY1j6dtI6p0MLBL2vAA3hs6MBdOQG5U", object : YouTubeThumbnailView.OnInitializedListener {
            override fun onInitializationSuccess(p0: YouTubeThumbnailView?, p1: YouTubeThumbnailLoader?) {
                if (youtubeVideoKey != null) {
                    val youTubeThumbnailLoader = p1
                    p1?.setOnThumbnailLoadedListener(object : ThumbnailLoadedListener(youtubeVideoKey) {})
                    youTubeThumbnailLoader?.setVideo(youtubeVideoKey)
                }
            }

            override fun onInitializationFailure(p0: YouTubeThumbnailView?, p1: YouTubeInitializationResult?) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }
        })
        setupViewPager(movieDetail)
    }

    private fun setupViewPager(movieDetail: MovieDetail){
        val mViewPagerAdapter = MovieDetailViewPagerAdapter(supportFragmentManager)
        val listFragment = ArrayList<BaseFragment>()
        val aboutFragment = AboutFragment(object : AboutFragment.OnLayoutChanged{
            override fun onLayoutChanged(layoutParams: ViewGroup.LayoutParams) {
                val layoutViewPager = viewPagerDetail.layoutParams
                layoutViewPager.height = layoutViewPager.height + layoutParams.height
                viewPagerDetail.layoutParams = layoutViewPager
            }
        })
        val movieDetailBundle = Bundle()
        movieDetailBundle.putSerializable(ConstantsURL.MOVIE_DETAIL_DATA, movieDetail)
        aboutFragment.arguments = movieDetailBundle
        listFragment.add(aboutFragment)
        mViewPagerAdapter.setListFragment(listFragment)
        viewPagerDetail.adapter = mViewPagerAdapter
    }

    private open inner class ThumbnailLoadedListener(val youtubeVideoKey: String) : YouTubeThumbnailLoader.OnThumbnailLoadedListener {
        override fun onThumbnailError(arg0: YouTubeThumbnailView, arg1: YouTubeThumbnailLoader.ErrorReason) {
            youtubethumbnailview.visibility = View.VISIBLE
            button.visibility = View.GONE
            Toast.makeText(applicationContext,
                    "ThumbnailLoadedListener.onThumbnailError()",
                    Toast.LENGTH_LONG).show()
        }

        override fun onThumbnailLoaded(arg0: YouTubeThumbnailView, arg1: String) {
            youtubethumbnailview.visibility = View.VISIBLE
            button.visibility = View.VISIBLE
            button.setOnClickListener {
                val youTubePlayerFragment = supportFragmentManager.findFragmentById(R.id.youtube_player) as YouTubePlayerSupportFragment
                youTubePlayerFragment.initialize("AIzaSyChhY1j6dtI6p0MLBL2vAA3hs6MBdOQG5U", object : YouTubePlayer.OnInitializedListener {
                    override fun onInitializationFailure(p0: YouTubePlayer.Provider?, p1: YouTubeInitializationResult?) {
                        Toast.makeText(baseContext, "Fail", Toast.LENGTH_SHORT).show()
                    }

                    override fun onInitializationSuccess(p0: YouTubePlayer.Provider?, youTubePlayer: YouTubePlayer?, p2: Boolean) {
                        youtubethumbnailview.visibility = View.GONE
                        button.visibility = View.GONE
                        youTubePlayer?.loadVideo(youtubeVideoKey)
                    }

                })
            }
        }
    }

    class MovieDetailViewPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {
        val listFragment: ArrayList<BaseFragment> = arrayListOf()

        fun setListFragment(list: List<BaseFragment>) {
            listFragment.clear()
            listFragment.addAll(list)
        }

        override fun getItem(position: Int): Fragment {
            return listFragment[position]
        }

        override fun getCount(): Int {
            return listFragment.size
        }

        override fun getPageTitle(position: Int): CharSequence {
            return listFragment[position].toString()
        }
    }
}