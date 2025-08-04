package com.hilt.compnavigate.feature.search.data.domain.repository

import com.hilt.compnavigate.feature.search.domain.model.Recipe

class SearchRepoImpl : SearchRepository {
    private val searchApiService = SearchApiService()
    override fun getRecipes(): List<Recipe> {
        return searchApiService.getRecipes(s)
    }

    override fun getRecipeDetails(recipeId: String): RecipeDetails {

    }
}
