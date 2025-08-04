package com.hilt.compnaviagte.search.domain.repository

interface SearchRepository {
    suspend fun getRecipes(): List<Receipe>
    suspend fun getRecipeDetails(id: String): ReceipeDetails
}
