package com.utad.rvwithmvvc.data.network

import retrofit2.http.Query
import com.utad.rvwithmvvc.data.model.PageModel
import retrofit2.Response
import retrofit2.http.GET

interface MovieApiClient {

    @GET("now_playing?language=en-ES")
    suspend fun getMoviesAllNowPlayingMovie(
        @Query("api_key") apiKey: String,
        @Query("page") page: Int,
    ): Response<List<PageModel>>
}