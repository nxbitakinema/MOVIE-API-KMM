package com.nx.movie_api_kmm.domain.usecase

import com.nx.movie_api_kmm.domain.model.Movie
import com.nx.movie_api_kmm.domain.repository.MovieRepository
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

class GetMoviesUseCase: KoinComponent {

    private val repository: MovieRepository by inject()

    @Throws(Exception::class)
    suspend operator fun invoke(page: Int): List<Movie> {
        return repository.getMovies(page = page)
    }

}