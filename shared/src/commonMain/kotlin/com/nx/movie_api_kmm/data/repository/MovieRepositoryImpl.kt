package com.nx.movie_api_kmm.data.repository

import com.nx.movie_api_kmm.data.remote.RemoteDataSource
import com.nx.movie_api_kmm.data.util.toMovie
import com.nx.movie_api_kmm.domain.model.Movie
import com.nx.movie_api_kmm.domain.repository.MovieRepository

internal class MovieRepositoryImpl(

    private val remoteDataSource: RemoteDataSource

): MovieRepository {

    override suspend fun getMovies(page: Int): List<Movie> {
        return remoteDataSource.getMovies(page = page).results.map {
            it.toMovie()
        }
    }

    override suspend fun getMovie(movieId: Int): Movie {
        return remoteDataSource.getMovie(movieId = movieId).toMovie()
    }

}