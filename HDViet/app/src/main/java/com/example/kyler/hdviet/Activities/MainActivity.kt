package com.example.kyler.hdviet.Activities

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import android.support.v4.view.ViewPager.OnPageChangeListener
import android.view.Gravity
import com.example.kyler.hdviet.Fragment.BaseFragment
import com.example.kyler.hdviet.Fragment.Series.SeriesFragment
import com.example.kyler.hdviet.Fragment.Movies.MoviesFragment
import com.example.kyler.hdviet.Fragment.Populars.PopularsFragment
import com.example.kyler.hdviet.R
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.layout_content_main.*
import kotlinx.android.synthetic.main.layout_toolbar.*

class MainActivity : BaseActivity(){

    override fun getResLayout(): Int {
        return R.layout.activity_main
    }

    override fun initView() {
        super.initView()
        val mViewPagerAdapter = MainViewPagerAdapter(supportFragmentManager)
        val listFragment = ArrayList<BaseFragment>()
        listFragment.add(PopularsFragment())
        listFragment.add(SeriesFragment())
        listFragment.add(MoviesFragment())
        mViewPagerAdapter.setListFragment(listFragment)
        vPagerMain.adapter = mViewPagerAdapter
        vPagerMain.addOnPageChangeListener(object : OnPageChangeListener {
            override fun onPageScrollStateChanged(state: Int) {

            }

            override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {

            }

            override fun onPageSelected(position: Int) {
                tvTitle.text = mViewPagerAdapter.getPageTitle(position)
            }
        })
        tvTitle.text = mViewPagerAdapter.getPageTitle(0)
        tabMain.setupWithViewPager(vPagerMain)
        navMenuIcon.setOnClickListener {
            if (mDrawer.isDrawerOpen(Gravity.START)) {
                mDrawer.closeDrawers()
            } else {
                mDrawer.openDrawer(Gravity.START)
            }
        }
    }

    class MainViewPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {
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
