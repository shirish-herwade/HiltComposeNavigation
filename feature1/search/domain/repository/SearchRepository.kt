package feature1.search.domain.repository

import com.hilt.compnavigate.feature.search.domain.model.Recipe
import com.hilt.compnavigate.feature.search.domain.model.RecipeDetails

interface SearchRepository {
    suspend fun getRecipes(): List<Recipe>
    suspend fun getRecipeDetails(id: String): RecipeDetails
}
