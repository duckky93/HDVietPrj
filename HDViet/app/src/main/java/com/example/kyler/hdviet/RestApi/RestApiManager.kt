package com.example.kyler.hdviet.RestApi

import com.example.kyler.hdviet.Constants.ConstantsURL
import com.google.gson.JsonObject
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

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
        fun searchMovie(@Header("Access-Token") token: String,
                        @Query("keyword") keyword: String,
                        @Query("page") page: Int,
                        @Query("limit") limit: Int): Call<JsonObject>

    }

    interface RestSSLApi {

        @GET("user/login")
        fun login_useSSL(@Query("email") email: String,
                         @Query("password") password: String): Call<JsonObject>

        @GET("category")
        fun getCategory_useSSL(@Header("Access-Token") token: String): Call<JsonObject>

    }

}