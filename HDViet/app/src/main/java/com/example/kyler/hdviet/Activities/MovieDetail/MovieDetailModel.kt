package com.example.kyler.hdviet.Activities.MovieDetail

import android.content.Context
import android.widget.Toast
import com.example.kyler.hdviet.Entities.MovieDetail
import com.example.kyler.hdviet.RestApi.RestApiManager
import com.google.gson.Gson
import com.google.gson.JsonObject
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

/**
 * Created by kyler on 05/07/2017.
 */
class MovieDetailModel(val context : Context) : IModelDetail{

    var presenter : IPresenterDetail? = null

    override fun attachPresenter(presenter: IPresenterDetail) {
        this.presenter = presenter
    }

    override fun getMovieDetail(headers: Map<String, String>, queries: Map<String, String>) {
        val call = RestApiManager.createSSLApiService().getMovieDetail(headers, queries)
        call.enqueue(object : Callback<JsonObject>{
            override fun onResponse(call: Call<JsonObject>?, response: Response<JsonObject>?) {
                if(response?.isSuccessful!!){
                    val json = response.body()
                    val movieDetailJson = json.getAsJsonObject("r")
                    val movieDetail : MovieDetail = Gson().fromJson(movieDetailJson,MovieDetail::class.java)
                    presenter?.onDetailResponse(movieDetail)
                } else {
                    Toast.makeText(context, "Get Movie Detail fail", Toast.LENGTH_SHORT).show()
                }
            }

            override fun onFailure(call: Call<JsonObject>?, t: Throwable?) {
                Toast.makeText(context, "Get Movie Detail API onFailure", Toast.LENGTH_SHORT).show()
            }

        })
    }

}