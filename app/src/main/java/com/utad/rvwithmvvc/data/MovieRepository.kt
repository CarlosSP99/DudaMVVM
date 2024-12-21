package com.utad.rvwithmvvc.data

import com.utad.rvwithmvvc.data.model.MovieModel
import com.utad.rvwithmvvc.data.model.PageModel
import com.utad.rvwithmvvc.data.modelMovie.Movie
import com.utad.rvwithmvvc.data.modelMovie.todomain
import com.utad.rvwithmvvc.data.network.MovieService
import javax.inject.Inject

class MovieRepository @Inject constructor( private val movieService: MovieService ){

    suspend fun getAllMovieFromApi(): List<Movie>{
        var listMovieModel = mutableListOf<MovieModel>()
        val listPage = movieService.getMovies()

        for(movies in listPage){
            listMovieModel = movies.results.toMutableList()
        }
        val listMovie=modifyMovieModelToMovie(listMovieModel)
        return  listMovie
    }

    suspend fun modifyMovieModelToMovie(mutableList: MutableList<MovieModel>): List<Movie>{
        return mutableList.map{
            it.todomain()
        }
    }

}