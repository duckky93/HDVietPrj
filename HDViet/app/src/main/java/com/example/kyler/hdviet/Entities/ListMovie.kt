package com.example.kyler.hdviet.Entities

import com.google.gson.Gson
import com.google.gson.JsonObject
import com.google.gson.annotations.SerializedName
import com.google.gson.reflect.TypeToken

/**
 * Created by kyler on 03/07/2017.
 */

class ListMovie : BaseObject() {

    @SerializedName("lists")
    private val dataArray: JsonObject? = null

    val listMovie : List<Movie>
        get() {
            val listType = object : TypeToken<List<Movie>>() {
            }.type
            return Gson().fromJson(dataArray!!.toString(), listType)
        }
}
