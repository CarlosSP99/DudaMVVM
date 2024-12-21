package com.utad.rvwithmvvc.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.utad.rvwithmvvc.data.model.MovieModel
import com.utad.rvwithmvvc.domain.GetMoviesUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MovieViewModel @Inject constructor
    (private val getMoviesUseCase: GetMoviesUseCase): ViewModel(){

    val movieModel = MutableLiveData<MovieModel>()
    val isLoading = MutableLiveData<Boolean>()

    fun
}