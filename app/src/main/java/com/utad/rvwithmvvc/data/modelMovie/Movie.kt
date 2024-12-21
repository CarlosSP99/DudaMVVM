package com.utad.rvwithmvvc.data.modelMovie

import com.google.gson.annotations.SerializedName
import com.utad.rvwithmvvc.data.model.MovieModel

data class Movie(
     val title: String,
     val popularity: Double,
     val overview: String,
     val releaseDate: String,
     val posterPath: String
)

fun MovieModel.todomain() = Movie(title, popularity, overview, releaseDate, posterPath)