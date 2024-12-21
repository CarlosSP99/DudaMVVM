package com.utad.rvwithmvvc.data.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class MovieModel(
    @SerializedName("title") val title: String,
    @SerializedName("popularity") val popularity: Double,
    @SerializedName("overview") val overview: String,
    @SerializedName("release_date") val releaseDate: String,
    @SerializedName("poster_path") val posterPath: String
): Serializable