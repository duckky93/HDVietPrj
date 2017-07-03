package com.example.kyler.hdviet.Fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Created by kyler on 09/06/2017.
 */

abstract class BaseFragment : Fragment() {

    abstract fun getResLayout() : Int

    open fun initView(view: View){}

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater?.inflate(getResLayout(), container, false)
        initView(view!!)
        return view
    }
}
