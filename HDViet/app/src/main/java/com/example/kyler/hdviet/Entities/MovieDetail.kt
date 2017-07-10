package com.example.kyler.hdviet.Entities

import com.google.gson.annotations.SerializedName

/**
 * Created by kyler on 05/07/2017.
 */

class MovieDetail {
    @SerializedName("MovieID")
    val movieID: String? = null
    @SerializedName("MovieName")
    val movieName: String? = null
    @SerializedName("KnownAs")
    val knownAs: String? = null
    @SerializedName("WrapLink")
    val wrapLink: String? = null
    @SerializedName("Trailer")
    val trailer: String? = null
    @SerializedName("Category")
    val category: List<Category>? = null
    @SerializedName("Poster")
    val poster: String? = null
    @SerializedName("Poster100x149")
    val poster100x149: String? = null
    @SerializedName("Poster124x184")
    val poster124x184: String? = null
    @SerializedName("Poster155x230")
    val poster155x230: String? = null
    @SerializedName("Poster214x321")
    val poster214x321: String? = null
    @SerializedName("Sequence")
    val sequence: String? = null
    @SerializedName("Episode")
    val episode: String? = null
    @SerializedName("Runtime")
    val runtime: String? = null
    @SerializedName("Cast")
    val cast: String? = null
    @SerializedName("Creator")
    val creator: String? = null
    @SerializedName("Director")
    val director: String? = null
    @SerializedName("PlotVI")
    val plotVI: String? = null
    @SerializedName("PlotEN")
    val plotEN: String? = null
    @SerializedName("ImdbRating")
    val imdbRating: String? = null
    @SerializedName("ImdbVotes")
    val imdbVotes: String? = null
    @SerializedName("Country")
    val country: String? = null
    @SerializedName("ReleaseDate")
    val releaseDate: String? = null
    @SerializedName("NewBackdrop")
    val newBackdrop: String? = null
    @SerializedName("NewBackdrop945x530")
    val newBackdrop945x530: String? = null
    @SerializedName("Backdrop")
    val backdrop: String? = null
    @SerializedName("Banner")
    val banner: String? = null
    @SerializedName("AudioDub")
    val audioDub: String? = null
    @SerializedName("AudioExt")
    val audioExt: List<MovieAudioExt>? = null
    @SerializedName("Audio")
    val audio: Int? = null
    @SerializedName("Child")
    val child: Int? = null
    @SerializedName("Relative")
    val relative: List<MovieRelative>? = null
    @SerializedName("HD")
    val hD: Int? = null
    @SerializedName("Facebook_Comment")
    val facebookComment: String? = null
    @SerializedName("isFavorite")
    val isFavorite: Int? = null
}
