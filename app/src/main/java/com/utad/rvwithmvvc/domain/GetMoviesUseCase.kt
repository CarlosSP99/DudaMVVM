package com.utad.rvwithmvvc.domain

import com.utad.rvwithmvvc.data.MovieRepository
import com.utad.rvwithmvvc.data.model.MovieModel
import com.utad.rvwithmvvc.data.model.PageModel
import javax.inject.Inject

class GetMoviesUseCase @Inject constructor(private val repository: MovieRepository) {

    suspend operator fun invoke(): List<MovieModel> {
        var movieList = mutableListOf<MovieModel>()
        val pageList = repository.getAllMovieFromApi()

        for (peliculas in pageList){
            val peli = peliculas.results
            movieList= peli.toMutableList()
        }

        return movieList
    }
}