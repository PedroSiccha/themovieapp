package com.pedro.themovieapp.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.pedro.themovieapp.model.MovieModel
import com.pedro.themovieapp.model.MovieProvider

class MovieViewModel : ViewModel() {

    val movieModel = MutableLiveData<MovieModel>()

    fun randomMovie(){
        val currentMovie: MovieModel = MovieProvider.random()
        movieModel.postValue(currentMovie)
    }

}