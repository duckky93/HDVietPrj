package com.example.kyler.hdviet.Fragment.Movies

import com.example.kyler.hdviet.IBaseModel

/**
 * Created by kyler on 30/06/2017.
 */
class ModelMovies : IModelMovies{

    var presenter : IPresenterMovies? = null

    override fun attachPresenter(presenter: IPresenterMovies) {
        this.presenter = presenter
    }

}