package com.example.kyler.hdviet.RestApi

import com.example.kyler.hdviet.Constants.ConstantsApi
import com.google.gson.JsonObject
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.*

/**
 * Created by kyler on 30/06/2017.
 */
class RestApiManager {

    companion object {
        private var restAPI: RestApi? = null
        private var restSSLAPI: RestSSLApi? = null

        fun createApiService(): RestApi {
            if (restAPI == null) {
                val retrofit = Retrofit.Builder()
                        .baseUrl(ConstantsApi.Base.URL)
                        .addConverterFactory(GsonConverterFactory.create())
                        .build()
                restAPI = retrofit.create((RestApi::class.java))
            }
            return restAPI!!
        }

        fun createSSLApiService(): RestSSLApi {
            if (restSSLAPI == null) {
                val retrofit = Retrofit.Builder()
                        .baseUrl(ConstantsApi.Base.URL_SSL)
                        .addConverterFactory(GsonConverterFactory.create())
                        .build()
                restSSLAPI = retrofit.create((RestSSLApi::class.java))
            }
            return restSSLAPI!!
        }
    }

    interface RestApi {

        @GET("api/v3/search")
        fun searchMovie(@HeaderMap headers: Map<String, String>,
                        @QueryMap queries: Map<String, String>): Call<JsonObject>

        @GET("api/v3/movie/filter")
        fun listMoviesByGenre(@HeaderMap headers: Map<String, String>,
                              @QueryMap queries: Map<String, String>): Call<JsonObject>

    }

    interface RestSSLApi {

        @GET("user/login")
        fun login(@HeaderMap headers: Map<String, String>,
                         @QueryMap queries: Map<String, String>): Call<JsonObject>

        @GET("category")
        fun getCategory(@HeaderMap headers: Map<String, String>,
                               @QueryMap queries: Map<String, String>): Call<JsonObject>

        @GET("movie")
        fun getMovieDetail(@HeaderMap headers: Map<String, String>,
                               @QueryMap queries: Map<String, String>): Call<JsonObject>

    }

}