package com.example.kyler.hdviet.Entities

import com.google.gson.annotations.SerializedName
import java.io.Serializable

/**
 * Created by kyler on 05/07/2017.
 */

class Category : Serializable {

    @SerializedName("CategoryID")
    val categoryID: String? = null
    @SerializedName("CategoryMap")
    val categoryMap: String? = null
    @SerializedName("CategoryName")
    val categoryName: String? = null
    @SerializedName("CategoryOrder")
    val categoryOrder: String? = null
    @SerializedName("CategoryStatus")
    val categoryStatus: String? = null
    @SerializedName("WrapLink")
    val wrapLink: String? = null

}