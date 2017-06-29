package com.example.kyler.hdviet.RestApi

import com.example.kyler.hdviet.Constants.ConstantsURL
import com.google.gson.JsonObject
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

/**
 * Created by kyler on 29/06/2017.
 */
interface RestApi {

    @GET("user/login")
    fun login_useSSL(@Query("email") email : String,
              @Query("password") password : String) : Call<JsonObject>

    @GET("category")
    fun getCategory_useSSL(@Header("Access-Token") token : String) : Call<JsonObject>

    @GET("api/v3/search")
    fun searchMovie(@Header("Access-Token") token : String,
                    @Query("keyword") keyword : String,
                    @Query("page") page : Int,
                    @Query("limit") limit : Int) : Call<JsonObject>

}