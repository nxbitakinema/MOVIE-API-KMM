package com.nx.movie_api_kmm.android

import android.app.Application
import com.nx.movie_api_kmm.android.di.appModule
import com.nx.movie_api_kmm.di.getSharedModules
import org.koin.core.context.startKoin

class Movie: Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            modules(appModule + getSharedModules())
        }
    }
}