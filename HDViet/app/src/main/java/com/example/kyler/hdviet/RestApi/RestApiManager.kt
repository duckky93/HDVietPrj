package com.example.kyler.hdviet.RestApi

import com.example.kyler.hdviet.Constants.ConstantsURL
import com.google.gson.JsonObject
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.*

/**
 * Created by kyler on 30/06/2017.
 */
class RestApiManager(){

    companion object {
        fun createApiService(): RestApi {
            val retrofit = Retrofit.Builder()
                    .baseUrl(ConstantsURL.Base.URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
            return retrofit.create(RestApi::class.java)
        }

        fun createSSLApiService(): RestSSLApi {
            val retrofit = Retrofit.Builder()
                    .baseUrl(ConstantsURL.Base.URL_SSL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
            return retrofit.create(RestSSLApi::class.java)
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
        fun login_useSSL(@HeaderMap headers: Map<String, String>,
                         @QueryMap queries: Map<String, String>): Call<JsonObject>

        @GET("category")
        fun getCategory_useSSL(@HeaderMap headers: Map<String, String>,
                               @QueryMap queries: Map<String, String>): Call<JsonObject>

    }

}