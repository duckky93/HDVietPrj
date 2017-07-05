package com.example.kyler.hdviet.Fragment.BaseMoviesFragment

import android.content.Context
import android.widget.Toast
import com.example.kyler.hdviet.Entities.Movie
import com.example.kyler.hdviet.RestApi.RestApiManager
import com.google.gson.Gson
import com.google.gson.JsonObject
import com.google.gson.reflect.TypeToken
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

/**
 * Created by kyler on 30/06/2017.
 */
class ModelMovies(val context: Context) : IModelMovies {

    override fun attachPresenter(presenter: IPresenterMovies) {
        this.presenter = presenter
    }

    var presenter: IPresenterMovies? = null

    override fun getMovies(headers: Map<String, String>, queries: Map<String, String>) {
        val call = RestApiManager.createApiService().listMoviesByGenre(headers, queries)
        call.enqueue(object : Callback<JsonObject> {

            override fun onResponse(call: Call<JsonObject>?, response: Response<JsonObject>?) {
                val json = response?.body()
                if (response?.isSuccessful!!) {
                    val jsonData = json?.getAsJsonObject("data")
                    val jsonList = jsonData?.getAsJsonArray("lists")
                    val movieType = object : TypeToken<List<Movie>>() {
                    }.type
                    val result = Gson().fromJson<MutableList<Movie>>(jsonList.toString(), movieType)
                    presenter?.onMovieResponse(result)
                } else {
                    Toast.makeText(context, "Fail", Toast.LENGTH_SHORT).show()
                }
            }

            override fun onFailure(call: Call<JsonObject>?, t: Throwable?) {
                Toast.makeText(context, "onFailure", Toast.LENGTH_SHORT).show()
            }

        })
    }

}