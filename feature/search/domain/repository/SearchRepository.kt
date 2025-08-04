package com.hilt.compnavigte.search.domain.repository

interface SearchRepository {
    suspend fun getRecipes(): List<Receipe>
    suspend fun getRecipeDetails(id: String): ReceipeDetails
}
