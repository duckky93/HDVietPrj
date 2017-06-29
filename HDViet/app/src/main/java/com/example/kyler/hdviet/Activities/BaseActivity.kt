package com.example.kyler.hdviet.Activities

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

/**
 * Created by kyler on 09/06/2017.
 */

abstract class BaseActivity : AppCompatActivity(){

    abstract fun getResLayout() : Int

    open fun initView(){

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getResLayout())
        initView()
    }
}
