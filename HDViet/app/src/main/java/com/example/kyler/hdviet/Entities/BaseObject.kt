package com.example.kyler.hdviet.Entities

import com.google.gson.Gson

/**
 * Created by kyler on 03/07/2017.
 */

open class BaseObject {

    fun asJson(): String {
        return Gson().toJson(this)
    }

    companion object {
        open fun <T> convertFromJson(json: String, classOfT: Class<T>): T {
            return Gson().fromJson(json, classOfT)
        }
    }
}
