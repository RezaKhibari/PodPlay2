package com.trios2024amrk.podplay.repository

import com.trios2024amrk.podplay.service.ItunesService

class ItunesRepo(private val itunesService: ItunesService) {
    suspend fun searchByTerm(term: String) =
        itunesService.searchPodcastByTerm(term)
}