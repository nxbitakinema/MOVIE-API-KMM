package com.nx.movie_api_kmm.domain.repository

import com.nx.movie_api_kmm.domain.model.Movie

internal interface MovieRepository {

    suspend fun getMovies(page: Int): List<Movie>

    suspend fun getMovie(movieId: Int): Movie

}