package com.nx.movie_api_kmm.android.di

import com.nx.movie_api_kmm.android.detail.DetailViewModel
import com.nx.movie_api_kmm.android.home.HomeViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
    viewModel { HomeViewModel(get()) }
    viewModel { params -> DetailViewModel(getMovieUseCase = get(), movieId = params.get()) }
}