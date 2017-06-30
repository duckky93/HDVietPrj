package com.example.kyler.hdviet.Fragment.Movies

/**
 * Created by kyler on 30/06/2017.
 */
class PresenterMovies : IPresenterMovies{

    var view : IViewMovies?=null

    constructor(){
        val model : IModelMovies = ModelMovies()
        model.attachPresenter(this)
    }

    override fun attachView(view: IViewMovies) {
        this.view = view
    }

}