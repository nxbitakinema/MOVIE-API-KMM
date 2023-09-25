package com.nx.movie_api_kmm.data.remote

import kotlinx.serialization.Serializable

@Serializable
internal data class MoviesResponse(

    val results: List<MovieRemote>

)
