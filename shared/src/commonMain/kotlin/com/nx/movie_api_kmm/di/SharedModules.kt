package com.nx.movie_api_kmm.di

import com.nx.movie_api_kmm.data.remote.MovieService
import com.nx.movie_api_kmm.data.remote.RemoteDataSource
import com.nx.movie_api_kmm.data.repository.MovieRepositoryImpl
import com.nx.movie_api_kmm.domain.repository.MovieRepository
import com.nx.movie_api_kmm.domain.usecase.GetMovieUseCase
import com.nx.movie_api_kmm.domain.usecase.GetMoviesUseCase
import com.nx.movie_api_kmm.util.provideDispatcher
import org.koin.dsl.module

private val dataModule = module {
    factory { RemoteDataSource(get(), get()) }
    factory { MovieService() }
}

private val utilityModule = module {
    factory { provideDispatcher() }
}

private val domainModule = module {
    single<MovieRepository> { MovieRepositoryImpl(get()) }
    factory { GetMoviesUseCase() }
    factory { GetMovieUseCase() }
}

private val sharedModules = listOf(domainModule, dataModule, utilityModule)

fun getSharedModules() = sharedModules