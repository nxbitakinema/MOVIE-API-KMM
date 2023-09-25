package com.nx.movie_api_kmm.data.util

import com.nx.movie_api_kmm.data.remote.MovieRemote
import com.nx.movie_api_kmm.domain.model.Movie

internal fun MovieRemote.toMovie(): Movie{

    return Movie(

        id = id,

        title = title,

        description = overview,

        imageUrl = getImageUrl(posterImage),

        releaseDate = releaseDate
    )
}

private fun getImageUrl(posterImage: String) = "https://image.tmdb.org/t/p/w500/$posterImage"